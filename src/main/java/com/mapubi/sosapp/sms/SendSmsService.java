package com.mapubi.sosapp.sms;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;

import javax.inject.Inject;

import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;

/**
 * Service to send SMS.
 * @author dassiorleando
 */
@Service
@Transactional
public class SendSmsService {
	Logger logger = LoggerFactory.getLogger(SendSmsService.class);

	@Inject
	private HashAuthService authService;

	public SmsResponse sendSms(SmsDTO smsDTO) throws JSONException {
        SmsResponse smsResponsefromJson = null;
		Gson gson = new Gson();
		ResponseEntity<String> response = sendSingle(smsDTO);
		if (response.getStatusCode() == HttpStatus.OK) {
			logger.debug("Successfull send sms throught mFS API");
			JSONObject responsSmsSendedJson = new JSONObject(response.getBody());
			logger.debug(" Result when Success : {}",
					responsSmsSendedJson.toString());

            smsResponsefromJson = gson.fromJson(
					responsSmsSendedJson.toString(), SmsResponse.class);
		} else if (response.getStatusCode() == HttpStatus.UNAUTHORIZED) {
			logger.debug("Error when sending send throught mFS API");
		}

		return smsResponsefromJson;
	}

	private ResponseEntity<String> sendSingle(SmsDTO smsDTO) throws JSONException {
		RestTemplate restTemplate = new RestTemplate();

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set("Content-Encoding", "UTF-8");
		headers.set("Accept-Charset", "UTF-8");
		headers.set("Authorization", "Basic " + authService.hashAuthHeader());

		String data = singleDataToSend(smsDTO).toString();
		HttpEntity<String> entity = new HttpEntity<String>(data, headers);
		ResponseEntity<String> response = restTemplate.exchange(
				"http://sms.mflashservices.com/restapi/sms/1/binary/single", HttpMethod.POST,
				entity, String.class);

		return response;
	}

	public JSONObject singleDataToSend(SmsDTO smsDTO) throws JSONException {
		JSONObject data = new JSONObject();
		data.put("to", "00237"+smsDTO.getPhoneNumber());
		data.put("from", getSender());

		JSONObject binary = new JSONObject();

		String encodedsms = String.format("%x", new BigInteger(1, smsDTO
				.getMessage().getBytes(StandardCharsets.ISO_8859_1)));
		logger.debug("Encoded sms is : {}", encodedsms);
		String spaceEncodedSMS = spaceBetweenChar(encodedsms);
		logger.debug("Encoded sms with Spaces is : {}", spaceEncodedSMS);
		// binary.put("hex",
		// "48 65 6c 6c 6f 20 77 6f 72 6c 64 2c 20 ce 9a ce b1 ce bb ce b7 ce bc e1 bd b3 cf 81 ce b1 20 ce ba e1 bd b9 cf 83 ce bc ce b5 2c 20 e3 82 b3 e3 83 b3 e3 83 8b e3 83 81 e3 83 8f");
		binary.put("hex", spaceEncodedSMS);
		binary.put("dataCoding", 3);
		binary.put("esmClass", 0);
		data.put("binary", binary);
		logger.debug("Json Data to send is : {}", data.toString());

		return data;
	}

	private String spaceBetweenChar(String encodedsms) {
		StringBuilder str = new StringBuilder();
		for (int i = 1; i <= encodedsms.length(); i++) {
			if ((i % 2) == 0) {
				Character strOne = encodedsms.charAt(i - 2);
				Character strTwo = encodedsms.charAt(i - 1);
				str.append(strOne.toString() + strTwo.toString());

				if (i != encodedsms.length()) {
					str.append(" ");
				}
			}
		}

		return str.toString();
	}

    private String getSender() {
    	String result = "SIH-Paodes";
        return result;
    }

}


package com.mapubi.sosapp.job;

import java.util.List;

import org.apache.http.HttpHost;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.mapubi.sosapp.dao.AccountRepository;
import com.mapubi.sosapp.dao.SOSEventRepository;
import com.mapubi.sosapp.entities.Account;
import com.mapubi.sosapp.entities.SOSEvent;
import com.mapubi.sosapp.entities.SOSUser;
import com.mapubi.sosapp.sms.SendSmsService;

@Service
public class SOSEventJobImpl implements SOSEventJob {
	@Autowired
	private SOSEventRepository sosEventRepository;
	@Autowired
	private AccountRepository accountRepository;
	@Autowired
	private SendSmsService sendSmsService;

	@Override
	public SOSEvent save(SOSEvent alert) {
		// TODO Auto-generated method stub
		return sosEventRepository.save(alert);
	}
	
	@Override
	public SOSEvent merge(SOSEvent alert) {
		// TODO Auto-generated method stub
		return sosEventRepository.saveAndFlush(alert);
	}

	@Override
	public List<SOSEvent> listAll() {
		// TODO Auto-generated method stub
		return sosEventRepository.findAll();
	}

	@Override
	public boolean notifyAccount(Account account) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean notifyAllAccount() {
		// TODO Auto-generated method stub
		//List<Account> accounts = accountRepository.findAll();
		//Iterator<Account> iterator = accounts.iterator();
		//while (iterator.hasNext()) {
			//Account account = (Account) iterator.next();
		//}
		/*SmsDTO smsDTO = new SmsDTO();
	    smsDTO.setPhoneNumber("670811960");
	    smsDTO.setMessage("User created successfully !");
	    sendSmsService.sendSms(smsDTO);*/
		//RestTemplate restTemplate = new RestTemplate();
		/*String proxyUrl = "http.sms.mflashservices.com";
		int port = 8080;
		HttpHost myProxy = new HttpHost(proxyUrl, port);
        HttpClientBuilder clientBuilder = HttpClientBuilder.create();
        clientBuilder.setProxy(myProxy);
        HttpClient httpClient = clientBuilder.build();
        HttpComponentsClientHttpRequestFactory factory = new HttpComponentsClientHttpRequestFactory();
        factory.setHttpClient(httpClient);
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set("Content-Encoding", "UTF-8");
		headers.set("Accept-Charset", "UTF-8");
		headers.set("Authorization", "Basic ZWxvdW5kb3U6Vm91UHU1UmQ=");
		RestTemplate restTemplate = new RestTemplate(factory);

		String data = "{\"to\":SOSAPP,\"from\":00237670811960,\"text:creates\"}";
		HttpEntity<String> entity = new HttpEntity<String>(data, headers);
		ResponseEntity<String> response = restTemplate.exchange(
				"http://sms.mflashservices.com/restapi/sms/1/binary/single", HttpMethod.POST,
				entity, String.class);*/
		
		return false;
	}

	@Override
	public boolean notifyUser(SOSUser user) {
		// TODO Auto-generated method stub
		return false;
	}
	
    private RestTemplate createRestTemplate() throws Exception {
        final String username = "eloundou";
        final String password = "myPass";
        final String proxyUrl = "proxy.nyc.bigtower.com";
        final int port = 8080;

        CredentialsProvider credsProvider = new BasicCredentialsProvider();
        credsProvider.setCredentials( 
                new AuthScope(proxyUrl, port), 
                new UsernamePasswordCredentials(username, password));

        HttpHost myProxy = new HttpHost(proxyUrl, port);
        HttpClientBuilder clientBuilder = HttpClientBuilder.create();

        clientBuilder.setProxy(myProxy).setDefaultCredentialsProvider(credsProvider).disableCookieManagement();

        HttpClient httpClient = clientBuilder.build();
        HttpComponentsClientHttpRequestFactory factory = new HttpComponentsClientHttpRequestFactory();
        factory.setHttpClient(httpClient);

        return new RestTemplate(factory);
    }

}

package com.mapubi.sosapp.sms;

import java.util.List;

/**
 * DTO to handle response when send single SMS.
 * @author dassi
 *
 */
public class SmsResponse {
	List<SmsResponseDetails> messages;

	SmsResponse() {
	}

	public List<SmsResponseDetails> getMessages() {
		return messages;
	}

	public void setMessages(List<SmsResponseDetails> messages) {
		this.messages = messages;
	}

	@Override
	public String toString() {
		return "SMSResponse [messages=" + messages + "]";
	}

	/*
	public SMSResponse getFromJson(JSONObject jsonObject) throws JSONException {
		List<SMSResponseDetails> responsMessages = new ArrayList<SMSResponseDetails>();
		JSONArray jsonArray = jsonObject.getJSONArray("messages");

		for(int n = 0; n < jsonArray.length(); n++) {
		    JSONObject object = jsonArray.getJSONObject(n);



		}


		return null;
	} */
}

package com.mapubi.sosapp.sms;

public class SmsResponseDetails {
	private String to;
	private SmsStatus status;
	private int smsCount;
	private String messageId;

	SmsResponseDetails(){

	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public SmsStatus getStatus() {
		return status;
	}

	public void setStatus(SmsStatus status) {
		this.status = status;
	}

	public int getSmsCount() {
		return smsCount;
	}

	public void setSmsCount(int smsCount) {
		this.smsCount = smsCount;
	}

	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	@Override
	public String toString() {
		return "SMSResponseDetails [to=" + to + ", status=" + status
				+ ", smsCount=" + smsCount + ", messageId=" + messageId + "]";
	}

}


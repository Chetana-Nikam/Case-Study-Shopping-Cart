package com.chetana.adminraccountservice.entity.nosql;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SellerMessageDetails {
	
    private int msgSeqNum;
    private String msgSubject;
    private String senderName;
    private String timestamp;
    private boolean starred;
    private int status;

    public int getMsgSeqNum() {
		return msgSeqNum;
	}

	public void setMsgSeqNum(int msgSeqNum) {
		this.msgSeqNum = msgSeqNum;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMsgBody() {
		return msgBody;
	}

	public void setMsgBody(String msgBody) {
		this.msgBody = msgBody;
	}

	public String getMsgSubject() {
		return msgSubject;
	}

	public void setMsgSubject(String msgSubject) {
		this.msgSubject = msgSubject;
	}

	public String getSenderName() {
		return senderName;
	}

	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public boolean isStarred() {
		return starred;
	}

	public void setStarred(boolean starred) {
		this.starred = starred;
	}

	private String msgBody;

    public SellerMessageDetails(int msgSeqNum, int status, String msgBody, String msgSubject, String senderName,
			String timestamp, boolean starred) {
		super();
		this.msgSeqNum = msgSeqNum;
		this.status = status;
		this.msgBody = msgBody;
		this.msgSubject = msgSubject;
		this.senderName = senderName;
		this.timestamp = timestamp;
		this.starred = starred;
	}

	
}

package com.chetana.adminraccountservice.entity.nosql;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SellerAccountNotification {

    private int severityLevel;
    private boolean starred;
    private String notificationMsg;
    private String timestamp;

    public SellerAccountNotification(int severityLevel, boolean starred, String notificationMsg, String timestamp) {
		super();
		this.severityLevel = severityLevel;
		this.starred = starred;
		this.notificationMsg = notificationMsg;
		this.timestamp = timestamp;
	}

	
	public int getSeverityLevel() {
		return severityLevel;
	}

	public void setSeverityLevel(int severityLevel) {
		this.severityLevel = severityLevel;
	}

	public boolean isStarred() {
		return starred;
	}

	public void setStarred(boolean starred) {
		this.starred = starred;
	}

	public String getNotificationMsg() {
		return notificationMsg;
	}

	public void setNotificationMsg(String notificationMsg) {
		this.notificationMsg = notificationMsg;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
}

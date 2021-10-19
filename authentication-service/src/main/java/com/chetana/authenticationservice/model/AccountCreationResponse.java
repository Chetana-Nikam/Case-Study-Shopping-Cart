package com.chetana.authenticationservice.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AccountCreationResponse {
    private String account_creation_status;
    public AccountCreationResponse(String account_creation_status, String error_msg) {
		super();
		this.account_creation_status = account_creation_status;
		this.error_msg = error_msg;
	}
	private String error_msg;
	public String getAccount_creation_status() {
		return account_creation_status;
	}
	public void setAccount_creation_status(String account_creation_status) {
		this.account_creation_status = account_creation_status;
	}
	public String getError_msg() {
		return error_msg;
	}
	public void setError_msg(String error_msg) {
		this.error_msg = error_msg;
	}
	public AccountCreationResponse() {
		super();
	}
	
	
}

package com.chetana.authenticationservice.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AuthenticationResponse {

    private String jwt;
    private String error;
    public AuthenticationResponse(String jwt, String error, String firstName) {
		super();
		this.jwt = jwt;
		this.error = error;
		this.firstName = firstName;
	}
	private String firstName;
	public String getJwt() {
		return jwt;
	}
	public void setJwt(String jwt) {
		this.jwt = jwt;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	
}
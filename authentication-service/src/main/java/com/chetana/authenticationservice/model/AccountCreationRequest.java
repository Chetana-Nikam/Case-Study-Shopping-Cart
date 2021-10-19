package com.chetana.authenticationservice.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AccountCreationRequest {
    private String username;
    private String password;
    private String lastname;
    
    
    
    public AccountCreationRequest() {
		super();
	}
	public AccountCreationRequest(String username, String password, String lastname, String firstname, String email) {
		super();
		this.username = username;
		this.password = password;
		this.lastname = lastname;
		this.firstname = firstname;
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	private String firstname;
    private String email;
    
    
	@Override
	public String toString() {
		return "AccountCreationRequest [username=" + username + ", password=" + password + ", lastname=" + lastname
				+ ", firstname=" + firstname + ", email=" + email + "]";
	}
    
    
}

package com.example.demo.CallFirstSpringBootApplication;

public class AuthenticationResponse {

	private String jwt;

	public void setJwt(String jwt) {
		this.jwt = jwt;
	}

	public AuthenticationResponse(String jwt) {
		super();
		this.jwt = jwt;
	}

	public AuthenticationResponse() {

	}

	public String getJwt() {
		return jwt;
	}

}

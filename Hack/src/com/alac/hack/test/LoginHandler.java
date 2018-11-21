package com.alac.hack.test;


import com.amazonaws.services.lambda.runtime.Context;

public class LoginHandler implements RequestHandler<LoginMsg, LoginMsg> {
	public LoginMsg handleRequest(LoginMsg request, Context context) {
		return request;
	}
}

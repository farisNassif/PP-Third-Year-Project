package services;

import server.ServerRunner;

public class Validation {

	public static String loginOrRegister(String message) {
		if (message.equals("1")) {
			ServerRunner.loginUser();
			return "You have chosen to Login";
		} else if (message.equals("2")) {
			ServerRunner.registerUser();
			return "You have chosen to Register";
		} else {
			return "Invalid input, Please enter 1 OR 2";
		}
	}

}

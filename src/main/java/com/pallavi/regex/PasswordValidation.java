package com.pallavi.regex;

public class PasswordValidation {
	public static void main(String[] args) {
		{
			String passwd = "aaZZa44@";
			String pattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}";
			System.out.println(passwd.matches(pattern));
		}
	}
}

package com.pallavi.regexx;

import java.util.Scanner;

public class PasswordValidator {
	public static void main(String args[]) {
		System.out.println("Enter the User Name");
		Scanner sc = new Scanner(System.in);
		String uName = sc.nextLine();
		System.out.println("Enter the Password");
		String uPassword = sc.nextLine();
		PasswordValidator pp = new PasswordValidator();
		pp.passwordValidation(uName, uPassword);
	}

	public void passwordValidation(String name, String pass) {
		boolean valid = true;
		
		if (pass.length() > 20 && pass.length() < 8) {
			System.out.println("The password length must be greater than 8 and less than 20");
			valid = false;
		}
		String uCase = "(.*[A-Z].*)";
		if (!pass.matches(uCase)) {
			System.out.println("Password should contain atleast one upper case");
			valid = false;
		}
		String lCase = "(.*[a-z].*)";
		if (!pass.matches(lCase)) {
			System.out.println("Password must contain atleast one lowe case");
			valid = false;
		}
		String num = "(.*[0-9].*)";
		if (!pass.matches(num)) {
			System.out.println("Password should contain atleast one number");
			valid = false;
		}
		String sChar = "(.*[@,#,$,%,&,*].*)";
		if (!pass.matches(sChar)) {
			System.out.println("Password must contain atleast one special character");
			valid = false;
		}
		if (valid) {
			System.out.println("Password is Valid");
		}
	}

}

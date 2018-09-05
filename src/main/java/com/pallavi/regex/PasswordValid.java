package com.pallavi.regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValid {
	public static void main(String[] args) {
		List<String> email=new ArrayList();
		email.add("Pallavi@gmail.com");
		email.add("Pallavi1@gmail.com");
		email.add("Pallavi2@gmail.com");
		email.add("Pallavi3@gmail.com");
		email.add("Pallavi4@gmail.com");
		email.add("Pallavi5@gmail.com");
		email.add("@yahoo.com");
		email.add("@hotmail.com");
		 
		String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
		 
		Pattern pattern = Pattern.compile(regex);
		 
		for(String emails : email){
		    Matcher matcher = pattern.matcher(emails);
		    System.out.println(emails +" : "+ matcher.matches());
		}
		 

	}
	}


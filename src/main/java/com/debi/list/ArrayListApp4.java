package com.debi.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class GirlsName {
	private String email;
	private int rollNumber;

	public GirlsName(String email, int rollNumber) {
		this.email = email;
		this.rollNumber = rollNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	@Override
	public String toString() {
		return "{" + "email='" + email + '\'' + ", rollNumber=" + rollNumber + '}';
	}

}

public class ArrayListApp4 {
	public static void main(String[] args) {
		List<GirlsName> girlsname = new ArrayList<>();
		girlsname.add(new GirlsName("pllavi@monamitech.com", 31));
		girlsname.add(new GirlsName("Jhuna@monamitech.com", 24));
		girlsname.add(new GirlsName("Binita@monamitech.com", 25));
		girlsname.add(new GirlsName("Janet@monamitech.com", 13));

		System.out.println("Girls List" + girlsname);

		girlsname.sort((girlsname1, girlsname2) -> {
			return girlsname1.getRollNumber() - girlsname2.getRollNumber();
		});

		girlsname.sort(Comparator.comparingInt(GirlsName::getRollNumber));

		System.out.println("Sorted GirlsName List by RollNumber : " + girlsname);

		Collections.sort(girlsname, Comparator.comparing(GirlsName::getEmail));
		System.out.println("Sorted Girlsname   by email : " + girlsname);
	}
}

package com.java.pallaviassignlist;

import java.util.ArrayList;
import java.util.List;

class User {
	private String name;
	private int age;
	public User(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
public class ArrayLIstUserDefinedObject
{
	public static void main(String[] args) {
		List<User> us=new ArrayList();
		us.add(new User("Ramesh",25));
		us.add(new User("Ritesh",26));
		us.add(new User("Raghab",27));
		us.add(new User("Ram",28));
	
		us.forEach(user -> {
			System.out.println("Naame"+user.getName()+"Age"+user.getAge());
		});
	}
}
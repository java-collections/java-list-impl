package com.java.pallaviassignlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		// TODO Auto-generated constructor stub
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
		@Override
		public String toString()
		{
		return "name="+name+
				"    age="+age;	
		}
	}


public class ArrayListSortObject {
	public static void main(String[] args) {
		List<Person> pp=new ArrayList();
		pp.add(new Person("Ashu",23));
		pp.add(new Person("Anu",24));
		pp.add(new Person("Arpu",23));
		pp.add(new Person("Atish",22));
		pp.add(new Person("Anjan",27));
		System.out.println("Person List"+pp);
		Collections.sort(pp,Comparator.comparing(Person::getName));
		System.out.println("Sorted person list by name"+pp);
	}

}

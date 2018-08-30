package com.pallavi.list;

import java.util.ArrayList;
import java.util.List;

import com.java.common.IArrayList;

public class ArrayListApp implements IArrayList{
	public static void main(String[] args) {
		IArrayList aa=new ArrayListApp();
		aa.createArrayListExample();
		
	}

	public void createArrayListExample() {
		// TODO Auto-generated method stub
		List<String> ll=new ArrayList();
		ll.add("Anu");
		ll.add("Ammu");
		ll.add("Anju");
		ll.add("Ashu");
		ll.add("Aru");
		ll.add("Ani");
		ll.add("Anshu");
		ll.add("Ammi");
		ll.add("AAradhya");
		ll.add("Anamika");
		System.out.println(ll);
		ll.add(4,"Ramesh");
		System.out.println(ll);
	}

	public void createArrayListFromCollectionExample() {
		// TODO Auto-generated method stub
		List <Integer> aa=new ArrayList();
		aa.add(2);
		aa.add(3);
		aa.add(4);
		aa.add(5);
		List <Integer> aa1=new ArrayList();
		aa1.add(6);
		aa1.add(7);
		aa1.add(8);
		aa1.add(9);
		aa1.add(6);
		aa1.add(7);
		aa.addAll(aa1);
		System.out.println(aa1);
		
	}

	public void accessElementsFromArrayListExample() {
		// TODO Auto-generated method stub
		List <String> aa2=new ArrayList<String>();
		System.out.println(aa2.isEmpty());
		aa2.add("Binita");
		aa2.add("Bikash");
		aa2.add("Binay");
		aa2.add("Bindu");
		aa2.add("Binash");
		aa2.add("Batash");
		aa2.add("Badal");
	System.out.println(aa2.size());	
	System.out.println(aa2);
	String firstName=aa2.get(0);
	String secondName=aa2.get(1);
	String lastName=aa2.get(aa2.size()-1);
	System.out.println("firstName is"+firstName);
	System.out.println("SecondName is"+secondName);
	System.out.println("Last Name is"+lastName);
	aa2.set(4, "pallavi");
	System.out.println(aa2);
	}
}

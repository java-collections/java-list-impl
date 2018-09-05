package com.java.pallaviassignlist;

import java.util.ArrayList;
import java.util.List;

public class AccessElementFromArrayListExample {
	public static void main(String[] args) {
		List<Integer> aa=new ArrayList();
		System.out.println("If the elements in the arraylist is empty"+aa.isEmpty());
		System.out.println("the size of the ArrayList"+aa.size());
		aa.add(12);
		aa.add(13);
		aa.add(14);
		aa.add(15);
		aa.add(16);
		aa.add(17);
		System.out.println("If the elements in the ArrayList is empty"+aa.isEmpty());
		System.out.println("the size of the ArrayList is"+aa.size());
		Integer firstElement=aa.get(0);
		Integer secondElement=aa.get(1);
		Integer thirdElement=aa.get(2);
		System.out.println("The First element is"+firstElement);
		System.out.println("The Second element is"+secondElement);
		System.out.println("The third element is"+thirdElement);
		aa.set(5,145);
		System.out.println("the last element is"+aa.get(5));
		
	}

}

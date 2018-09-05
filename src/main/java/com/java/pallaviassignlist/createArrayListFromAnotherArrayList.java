package com.java.pallaviassignlist;

import java.util.ArrayList;
import java.util.List;

public class createArrayListFromAnotherArrayList
{
	public static void main(String[] args) {
		List<String> name=new ArrayList();
		name.add("Pallavi");
		name.add("Sniti");
		name.add("Sanjana");
		name.add("Soyam");
		name.add("Saraang");
		name.add("Sai");
		System.out.println(name);
		List<String> name1=new ArrayList<String>();
		name1.add("Roy");
		name1.add("Raghab");
		name1.add("Rushi");
		name1.add("Ruhi");
		System.out.println(name.addAll(name1));
		System.out.println(name);
		}
}

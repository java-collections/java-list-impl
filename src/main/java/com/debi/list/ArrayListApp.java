package com.debi.list;

import java.util.ArrayList;
import java.util.List;

import com.java.common.IArrayList;

public class ArrayListApp implements IArrayList {

	public static void main(String[] args) {
		IArrayList list = new ArrayListApp();
		list.createArrayListExample();
		list.createArrayListFromCollectionExample();
		list.accessElementsFromArrayListExample();
	}

	public void createArrayListExample() {

		List<String> animals = new ArrayList<String>();
		animals.add("Lion");
		animals.add("Tiger");
		animals.add("Cat");
		animals.add("Dog");

		System.out.println(animals);

		animals.add(0, "Elephant");

		System.out.println(animals);

	}

	public void createArrayListFromCollectionExample() {
		List<Integer> firstFivePrimeNumbers = new ArrayList<Integer>();
		firstFivePrimeNumbers.add(2);
		firstFivePrimeNumbers.add(3);
		firstFivePrimeNumbers.add(5);
		firstFivePrimeNumbers.add(7);
		firstFivePrimeNumbers.add(11);

		List<Integer> firstTenPrimeNumbers = new ArrayList<Integer>(firstFivePrimeNumbers);

		List<Integer> nextFivePrimeNumbers = new ArrayList<Integer>();
		nextFivePrimeNumbers.add(13);
		nextFivePrimeNumbers.add(17);
		nextFivePrimeNumbers.add(19);
		nextFivePrimeNumbers.add(23);
		nextFivePrimeNumbers.add(29);
		firstTenPrimeNumbers.addAll(nextFivePrimeNumbers);

		System.out.println(firstTenPrimeNumbers);

	}

	public void accessElementsFromArrayListExample() {
		List<String> topCompanies = new ArrayList<String>();

		System.out.println("Is the topCompanies list empty? : " + topCompanies.isEmpty());

		topCompanies.add("Google");
		topCompanies.add("Apple");
		topCompanies.add("Microsoft");
		topCompanies.add("Amazon");
		topCompanies.add("Facebook");

		System.out.println("Here are the top " + topCompanies.size() + " companies in the world");
		System.out.println(topCompanies);

		String bestCompany = topCompanies.get(0);
		String secondBestCompany = topCompanies.get(1);
		String lastCompany = topCompanies.get(topCompanies.size() - 1);

		System.out.println("Best Company: " + bestCompany);
		System.out.println("Second Best Company: " + secondBestCompany);
		System.out.println("Last Company in the list: " + lastCompany);

		topCompanies.set(4, "Walmart");
		System.out.println("Modified top companies list: " + topCompanies);
	}

}

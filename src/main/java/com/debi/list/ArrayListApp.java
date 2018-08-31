package com.debi.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Predicate;

import com.java.common.IArrayList;

public class ArrayListApp implements IArrayList {

	public static void main(String[] args) {
		IArrayList list = new ArrayListApp();
		list.createArrayListExample();
		list.createArrayListFromCollectionExample();
		list.accessElementsFromArrayListExample();
		list.removeElementsFromArrayListExample();
		list.iterateOverArrayListExample();
		list.searchElementsInArrayListExample();
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

	public void removeElementsFromArrayListExample() {
		List<String> vehicle = new ArrayList<String>();
		vehicle.add("Car");
		vehicle.add("Bike");
		vehicle.add("Train");
		vehicle.add("Bus");
		vehicle.add("Truck");
		vehicle.add("Jeep");
		vehicle.add("Scooter");
		vehicle.add("Scooty");

		System.out.println("vehicles before removal" + vehicle);
		vehicle.remove(4);
		System.out.println("vehicles after removal of index(4) " + vehicle);
		boolean isRemoved = vehicle.remove("Jeep");
		System.out.println("After removing Jeep from vehicle list" + vehicle);

		List<String> lightVehicles = new ArrayList<String>();
		lightVehicles.add("Car");
		lightVehicles.add("Bike");
		lightVehicles.add("Scooter");
		lightVehicles.add("Scooty");
		vehicle.removeAll(lightVehicles);
		System.out.println("After removing all Light vehicles" + vehicle);
		vehicle.removeIf(new Predicate<String>() {

			public boolean test(String t) {
				// TODO Auto-generated method stub
				return t.startsWith("B");

			}
		});
		System.out.println("After removing all the vehicles that start with B from the arraylist" + vehicle);
		vehicle.clear();
		System.out.println("After clearing all the vehicles :" + vehicle);
	}

	public void iterateOverArrayListExample() {
		List<String> electronicItems = new ArrayList<String>();
		electronicItems.add("Fan");
		electronicItems.add("Bulb");
		electronicItems.add("Iron");
		electronicItems.add("Water Heater");
		electronicItems.add("Induction");
		System.out.println("=== Iterate using Java 8 forEach and lambda ===");
		electronicItems.forEach(electronicItem -> {
			System.out.println(electronicItem);
		});
		System.out.println("\n=== Iterate using an iterator() ===");
		Iterator<String> electronicItemsIterator = electronicItems.iterator();
		while (electronicItemsIterator.hasNext()) {
			String electronicItem = electronicItemsIterator.next();
			System.out.println(electronicItem);
		}

		System.out.println("\n=== Iterate using an iterator() and Java 8 forEachRemaining() method ===");
		electronicItemsIterator = electronicItems.iterator();
		electronicItemsIterator.forEachRemaining(electronicItem -> {
			System.out.println(electronicItem);
		});

		System.out.println("\n=== Iterate using a listIterator() to traverse in both directions ===");
		// Here, we start from the end of the list and traverse backwards.
		ListIterator<String> electronicItemsListIterator = electronicItems.listIterator(electronicItems.size());
		while (electronicItemsListIterator.hasPrevious()) {
			String electronicItem = electronicItemsListIterator.previous();
			System.out.println(electronicItem);
		}

		System.out.println("\n=== Iterate using simple for-each loop ===");
		for (String electronicItem : electronicItems) {
			System.out.println(electronicItem);
		}

		System.out.println("\n=== Iterate using for loop with index ===");
		for (int i = 0; i < electronicItems.size(); i++) {
			System.out.println(electronicItems.get(i));
		}

	}

	spublic void searchElementsInArrayListExample() {
		List<String> brandName = new ArrayList<>();
		brandName.add("Allensoly");
		brandName.add("LP");
		brandName.add("Flying Machine");
		brandName.add("Lee");
		brandName.add("Levies");
		brandName.add("Parx");
		brandName.add("Cool colors");

		// Check if an ArrayList contains a given element
		System.out.println("Does brandnames  contain Allensoly? : " + brandName.contains("Bob"));

		// Find the index of the first occurrence of an element in an ArrayList
		System.out.println("indexOf Allensoly: " + brandName.indexOf("Allensoly"));
		System.out.println("indexOf Parx: " + brandName.indexOf("Colors"));

		// Find the index of the last occurrence of an element in an ArrayList
		System.out.println("lastIndexOf Parx : " + brandName.lastIndexOf("Parx"));
		System.out.println("lastIndexOf John Miller : " + brandName.lastIndexOf("John Miller"));
	}
}

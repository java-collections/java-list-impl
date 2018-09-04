package com.debi.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArrayListApp3 {
	public static void main(String[] args) {
		List<String> animals = new ArrayList<>();
		animals.add("Tiger");
		animals.add("Lion");
		animals.add("Monkey");
		animals.add("Donkey");
		animals.add("Cat");
		animals.add("Dog");

		System.out.println("Animals before sorting : " + animals);

		animals.sort(new Comparator<String>() {
			@Override
			public int compare(String animal1, String animal2) {
				return animal1.compareTo(animal2);
			}
		});

		animals.sort((animal1, animal2) -> animal1.compareTo(animal2));
		System.out.println("  Sorted animals : " + animals);

		animals.sort(Comparator.naturalOrder());

		System.out.println("  Animals after sorting : " + animals);
	}

}

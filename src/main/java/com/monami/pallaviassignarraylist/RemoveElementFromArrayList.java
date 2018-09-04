package com.monami.pallaviassignarraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveElementFromArrayList {
	public static void main(String[] args) {
		List<String> countries=new ArrayList<String>();
		countries.add("India");
		countries.add("Pakistan");
		countries.add("Afganisthan");
		countries.add("Srilanka");
		countries.add("Japan");
		System.out.println("The added countries"+countries);
		countries.remove(3);
		System.out.println("After removal of 3 index element"+countries);
		boolean is=countries.remove("Pakistan");
		System.out.println("After removing of Pakistan element"+countries);
		countries.removeIf(new Predicate<String>()
		{	
			public boolean test(String s)
			{
				return s.startsWith("A");
			}
		});
		System.out.println("After removing the element"+countries);
		countries.clear();
		System.out.println("After Clearing the elements"+countries);
	}

}

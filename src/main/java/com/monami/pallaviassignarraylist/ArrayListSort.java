package com.monami.pallaviassignarraylist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArrayListSort {
	public static void main(String[] args) {
		List<String> a=new ArrayList<>();
		a.add("Ruhi");
		a.add("Rimu");
		a.add("Rinky");
		a.add("Rutu");
		System.out.println(a);
		a.sort(new Comparator<String>()
				{

					@Override
					public int compare(String o1, String o2) {
						// TODO Auto-generated method stub
						return o1.compareTo(o2);
					}
			
				});
		System.out.println(a);
	}
}

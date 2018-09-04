package com.monami.pallaviassignarraylist;

import java.util.ArrayList;
import java.util.List;

public class SearchElementInArrayList {
	public static void main(String[] args) {
		List<Integer> primeNo=new ArrayList();
		primeNo.add(2);
		primeNo.add(3);
		primeNo.add(5);
		primeNo.add(7);
		primeNo.add(11);
		System.out.println("Does array congtain 5"   +primeNo.contains(5));
		System.out.println("Index of element 7   "+primeNo.indexOf(7));
		System.out.println("Index of number 13"+primeNo.indexOf(13));
		System.out.println("Last Index  of 11  "+primeNo.lastIndexOf(11));
		System.out.println("Last index of 13"+primeNo.lastIndexOf(13));
	}

}

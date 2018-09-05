package com.java.pallaviassignlist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListCollectionSort {
	public static void main(String[] args) {
		List<Integer> num=new ArrayList<>();
		num.add(1);
		num.add(12);
		num.add(13);
		num.add(14);
		num.add(15);
		System.out.println("Before sorting "+num);
		Collections.sort(num);
		System.out.println("After sorting"+num);
	}

}

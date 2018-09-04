package com.debi.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListApp2 {

	    public static void main(String[] args) {
	        List<Integer> num = new ArrayList<>();
	        num.add(2450);
	        num.add(7609);
	        num.add(1887);
	        num.add(5345);
	        num.add(2689);

	        System.out.println("Before Sorting: " +num);

	     
	        Collections.sort(num);

	        System.out.println("After sorting using Collection.sort() method  : " + num);
	    }
	}


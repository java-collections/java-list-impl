package com.rabi.list;

import java.util.ArrayList;
import java.util.List;

import com.java.common.IArrayList;

public class ArrayListApp implements IArrayList{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IArrayList list=new ArrayListApp();
		list.createArrayListExample();
	}
	
	public  void createArrayListExample()
	{
		List<String> animals=new ArrayList<String>();
		animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cat");
        animals.add("Dog");

        System.out.println(animals);

        // Adding an element at a particular index in an ArrayList
        animals.add(2, "Elephant");

        System.out.println(animals);
	}

	@Override
	public void createArrayListFromCollectionExample() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void accessElementsFromArrayListExample() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeElementsFromArrayListExample() {
		// TODO Auto-generated method stub
		// added blank body
		// developers will write own code 
	}

	@Override
	public void iterateOverArrayListExample() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void searchElementsInArrayListExample() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	

}

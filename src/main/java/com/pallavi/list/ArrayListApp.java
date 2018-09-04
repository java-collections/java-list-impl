package com.pallavi.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

import com.java.common.IArrayList;

public class ArrayListApp implements IArrayList {
	public static void main(String[] args) {
		IArrayList aa = new ArrayListApp();
		aa.createArrayListExample();
		aa.accessElementsFromArrayListExample();
		aa.createArrayListFromCollectionExample();
		aa.removeElementsFromArrayListExample();
		aa.iterateOverArrayListExample();
		aa.searchElementsInArrayListExample();

	}

	public void createArrayListExample() {
		// TODO Auto-generated method stub
		List<String> ll = new ArrayList();
		ll.add("Anu");
		ll.add("Ammu");
		ll.add("Anju");
		ll.add("Ashu");
		ll.add("Aru");
		ll.add("Ani");
		ll.add("Anshu");
		ll.add("Ammi");
		ll.add("AAradhya");
		ll.add("Anamika");
		System.out.println(ll);
		ll.add(4, "Ramesh");
		System.out.println(ll);
	}

	public void createArrayListFromCollectionExample() {
		// TODO Auto-generated method stub
		List<Integer> aa = new ArrayList();
		aa.add(2);
		aa.add(3);
		aa.add(4);
		aa.add(5);
		List<Integer> aa1 = new ArrayList();
		aa1.add(6);
		aa1.add(7);
		aa1.add(8);
		aa1.add(9);
		aa1.add(6);
		aa1.add(7);
		aa.addAll(aa1);
		System.out.println(aa1);

	}

	public void accessElementsFromArrayListExample() {
		// TODO Auto-generated method stub
		List<String> aa2 = new ArrayList<String>();
		System.out.println(aa2.isEmpty());
		aa2.add("Binita");
		aa2.add("Bikash");
		aa2.add("Binay");
		aa2.add("Bindu");
		aa2.add("Binash");
		aa2.add("Batash");
		aa2.add("Badal");
		System.out.println(aa2.size());
		System.out.println(aa2);
		String firstName = aa2.get(0);
		String secondName = aa2.get(1);
		String lastName = aa2.get(aa2.size() - 1);
		System.out.println("firstName is" + firstName);
		System.out.println("SecondName is" + secondName);
		System.out.println("Last Name is" + lastName);
		aa2.set(4, "pallavi");
		System.out.println(aa2);
	}

	public void removeElementsFromArrayListExample() {
		// TODO Auto-generated method stub
		List<String> department=new ArrayList();
		department.add("MCA");
		department.add("Physics");
		department.add("Mathematics");
		department.add("Chemistry");
		department.add("Botany");
		department.add("Zoology");
		System.out.println(department);
		System.out.println(department.size());
		department.remove(5);
		System.out.println("After removal of element at index 5"+department);
		boolean aa=department.remove("Zoology");
		System.out.println("After removing Zoology"+department);
		List<String> department1=new ArrayList();
		department1.add("Economy");
		department1.add("ODIA");
		department1.add("Botany");
		department1.add("Mathematics");
		department1.add("Geography");
		System.out.println(department1.size());
		System.out.println("The elements are:"+department1);
		department1.removeAll(department);
		System.out.println(department1.size());
		System.out.println("The elements are:"+department1);
		department.removeIf(new Predicate<String>() {
			public boolean test(String s)
			{
				return s.startsWith("M");
			}
		});
		System.out.println("After removing the elements starts with M"+department);
		department.clear();
		System.out.println("After clearing all the elements"+department);
	}

	public void iterateOverArrayListExample() {
		// TODO Auto-generated method stub
		List<String> examPosition=new ArrayList();
		examPosition.add("First");
		examPosition.add("Second");
		examPosition.add("Third");
		examPosition.add("Fourth");
		examPosition.add("Fifth");
		examPosition.add("Sixth");
		System.out.println("Using Iterator Cursor and for each loop");
		examPosition.forEach(examPositionn ->{
			System.out.println(examPositionn);
			});
		System.out.println("Using an Iterator");
		Iterator<String> ii=examPosition.iterator();
		while(ii.hasNext())
		{
			String aa=ii.next();
			System.out.println(aa);
		}
		System.out.println("Using Iterator and for each loop");
		Iterator<String> aa=examPosition.iterator();
		examPosition.forEach(ii1 ->
		{
			System.out.println(ii1);
		});
		System.out.println("Using listIterator to traverse in both directions");
		java.util.ListIterator<String> aa1=examPosition.listIterator(examPosition.size());
		while(aa1.hasPrevious())
		{
			String aa2=aa1.previous();
			System.out.println(aa2);
		}
		System.out.println("Iterator using simple for each loop");
		for(String aa2:examPosition)
		{
			System.out.println(aa2);
		}
		System.out.println("Using for loop");
		for(int i=0;i<examPosition.size();i++)
		{
			System.out.println(examPosition.get(i));
		}
		
		
	}

	public void searchElementsInArrayListExample() {
		// TODO Auto-generated method stub
		List<Integer> num=new ArrayList();
		num.add(1);
		num.add(3);
		num.add(6);
		num.add(9);
		num.add(12);
		num.add(15);
		num.add(2);
		Iterator<Integer> ii=num.iterator();
		while(ii.hasNext())
		{
			Integer nm= ii.next();
			if(nm % 3==0)
			{
				ii.remove();
			}
		}
		System.out.println(num);
		
		
	}
}

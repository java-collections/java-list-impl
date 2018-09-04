package com.debi.list;

import java.util.ArrayList;
import java.util.List;

class ArrayListUserDefinedObject {
	private String teachername;
	private int salary;

	public ArrayListUserDefinedObject(String teachername, int salary) {
		this.teachername = teachername;
		this.salary = salary;
	}

	public String getTeachername() {
		return teachername;
	}

	public void setTeachername(String teachername) {
		this.teachername = teachername;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}

public class ArrayListApp1 {
	public static void main(String[] args) {
		List<ArrayListUserDefinedObject> arraylist = new ArrayList<ArrayListUserDefinedObject>();
		arraylist.add(new ArrayListUserDefinedObject("BidhuBhusan", 5000));
		arraylist.add(new ArrayListUserDefinedObject("Pravati", 10000));
		arraylist.add(new ArrayListUserDefinedObject("Pramila", 29000));

		arraylist.forEach(arraylistuserdefinedobject -> {
			System.out.println("TeacherName : " + arraylistuserdefinedobject.getTeachername() + ", salary : "
					+ arraylistuserdefinedobject.getSalary());
		});
	}
}
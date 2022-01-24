package com.bajaj.helloworld;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class Student1 {
	int id;
	String name;
	int marks;
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	public Student1(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
}

class sortById implements Comparator<Student1>{
	@Override
	public int compare(Student1 o1, Student1 o2) {
		// TODO Auto-generated method stub
		return o1.id-o2.id;
	}
}

class sortByName implements Comparator<Student1>{

	@Override
	public int compare(Student1 o1, Student1 o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}
	//if we exchange o1,o2 then order will be reversed
}

public class MyComparator {
	public static void main(String args[]) {
		List<Student1> s=new ArrayList<Student1>();
		s.add(new Student1(15,"bannu",76));
		s.add(new Student1(10,"chinnu",91));
		s.add(new Student1(11,"cherry",56));
		s.add(new Student1(7,"viswa",93));
		for(Student1 p:s) {
			System.out.println(p);
		}
		Collections.sort(s,new sortByName());
		for(Student1 p:s) {
			System.out.println(p);
		}
	}
}

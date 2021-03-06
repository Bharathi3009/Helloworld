package com.bajaj.helloworld;
import java.util.*;

class Student implements Comparable<Student>{
	int id;
	String name;
	int marks;
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public int compareTo(Student s2) {
		return this.name.compareTo(s2.name); //comparing by names
		// return this.id-s2.id;   -- comparing by integers
		/*if(this.id>s2.id) {      -- this also comparing by int
			return 1;
		}
		else if(this.id<s2.id) {
			return -1;
		}
		return 0;*/
		// TODO Auto-generated method stub
	}
}

public class MyComparable {
	public static void main(String args[]) {
		List<Student> s=new ArrayList<Student>();
		s.add(new Student(15,"bannu",76));
		s.add(new Student(10,"chinnu",91));
		s.add(new Student(11,"cherry",56));
		s.add(new Student(7,"viswa",93));
		for(Student p:s) {
			System.out.println(p);
		}
		Collections.sort(s);
		//Collections.sort(s,Collections.reverseOrder());
		for(Student p:s) {
			System.out.println(p);
		}
	}
}

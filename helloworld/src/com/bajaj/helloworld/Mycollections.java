package com.bajaj.helloworld;

import java.util.*;

class Employees{
	int empid;
	String empname;
	public Employees(int empid, String empname) {
		super();
		this.empid = empid;
		this.empname = empname;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + "]";
	}
	
}
class MySortById implements Comparator<Employees>{
	@Override
	public int compare(Employees o1, Employees o2) {
		// TODO Auto-generated method stub
		return o1.empid-o2.empid;
	}
}
public class Mycollections {
	public static void main(String args[]) {
		
		List<Employees> ls=new ArrayList<Employees>();
		Employees e1=new Employees(1,"bannu");
		ls.add(e1);
		ls.add(new Employees(2,"chinnu"));
		System.out.println(ls);
		ls.set(1,e1);
		for(Employees item:ls) {
			System.out.println(item);
		}
		
		
		List<Integer> l=new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		l.add(5);
		System.out.println(l);
		l.remove(1);
		System.out.println(l);
		l.contains(1);
		System.out.println(l.get(1));
		System.out.println(l.isEmpty());
		l.contains('a');
		l.add(2);
		System.out.println(l.size());
		//l.clear();
		System.out.println(l.isEmpty());
		System.out.println(l);
		
		Set<Integer> s1=new HashSet<Integer>();
		s1.add(1);
		s1.add(7);
		s1.add(83);
		s1.add(1);
		System.out.println(s1);
		
		System.out.println(s1.remove(1));
		System.out.println(s1);
		
		TreeMap<Employees,Integer> t=new TreeMap<>(new MySortById());
		t.put(e1,6);
		t.put(new Employees(0,"chinnu"),3);
		System.out.println(t);
		
	}

}

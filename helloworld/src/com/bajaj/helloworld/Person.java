package com.bajaj.helloworld;
//class and objects
class objecting {
	private int age;
	int Salary;
	String name;
	@Override
	public String toString() {
		return "Practice [age=" + age + ", name=" + name + ", salary=" + Salary + "]";
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	public void setSalary(int Salary) {
		this.age=Salary;
	}
	public int getSalary() {
		return Salary;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public objecting(int age,int salary,String name) {
		this.age=age;
		this.Salary=salary;
		this.name=name;
		System.out.println("reached");
		}
}

public class Person{
	public static void main(String args[]) {
		objecting bhars=new objecting(10,2000,"me");
		System.out.println(bhars.toString());
		
	}
}

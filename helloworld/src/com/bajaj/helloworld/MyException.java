package com.bajaj.helloworld;

public class MyException {
	public static void abc(int a) throws Exception{
		if(a<20) {throw new ArithmeticException("hey there");}
		else {System.out.println("go for it");}
	}
	public static void main(String args[]) {
		int a=10;
		try {
			abc(20);
			abc(10);
			abc(70);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			int ans=a/0;
		}
		catch(ArithmeticException e) {
			System.out.println("arithmetic block");
		}
		catch(Exception e) {
			System.out.println("catch block");
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}

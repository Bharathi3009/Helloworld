package com.bajaj.helloworld;
import java.util.Scanner;

public class helloworld {
	public static void main(String args[]) {
		int a=10;
		Scanner sc=new Scanner(System.in);
		int b= sc.nextInt();
		int c=sc.nextInt();
		a=c;
		c=b;
		b=a;
		String s = "bannu";
		char ch='A';
		System.out.println(b);
		System.out.println(c);
		System.out.println(a);	
		}

}

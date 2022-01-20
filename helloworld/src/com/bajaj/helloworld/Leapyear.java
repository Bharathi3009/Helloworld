package com.bajaj.helloworld;

import java.util.Scanner;

public class Leapyear {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a%100==0 && a%400==0) {
			System.out.println("leap");
		}
		else if(a%100!=0 && a%4==0) {
			System.out.println("leap");
		}
		else {
			System.out.println("not leap");
		}
	}
}

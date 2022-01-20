package com.bajaj.helloworld;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int ans= Rem(a);
		if(ans==0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");}
		
	}
	public static int Rem(int a) {
		int r=a%2;
		return r;
		}

}

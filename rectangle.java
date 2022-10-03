package com.java;

import java.util.Scanner;

public class rectangle {

	public static void main(String[] args) {
		int l,b,a2;
		System.out.println("Enter value for length and breadth: ");
		Scanner r=new Scanner(System.in);
		l=r.nextInt();
		b=r.nextInt();
		a2=l*b;
		System.out.println("Area of rectangle is : "+a2);
		
	}

}

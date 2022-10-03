package com.java;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		int s,a1;
		System.out.println("Enter the Side of Square");
		Scanner r=new Scanner(System.in);
		s=r.nextInt();
		a1=s*s;
		System.out.println("Area of Square is : "+a1);
	}

}

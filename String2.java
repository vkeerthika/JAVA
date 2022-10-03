package com.java;

public class String2 {

	public static void main(String[] args) {
		StringBuffer str=new StringBuffer("Cooking");
		str.append("Banking");
		System.out.println(str);
		str.insert(3, "Technology");
		System.out.println(str);
		str.replace(8, 16, "IOT");
		str.reverse();
		System.out.println(str);
		System.out.println(str.capacity());
	}

}

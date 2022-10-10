package com.java;

public class Constructor {
	int i;
	String s;
	float ino;
	
	Constructor(){
		i=29;
		s="days";
		ino=297.2f;
	}
	public static void main(String[] args) {
		Constructor ob=new Constructor();
		System.out.println("i="+ob.i);
		System.out.println("s="+ob.s);
		System.out.println("ino="+ob.ino);
	
	}

}

package com.java;

public class ConstructorOverloading {
int i,j,k;
	
	ConstructorOverloading(){
		System.out.println("constructor with No Argument :");
	}
	ConstructorOverloading(int i){
		System.out.println("constructor with One Argument :"+i);
	}
	ConstructorOverloading(int i,int j){
		System.out.println("constructor with Two Argument :"+i+" and "+j);
	}
	public static void main(String[] args) {
		ConstructorOverloading ob = new ConstructorOverloading();
		ConstructorOverloading ob1 = new ConstructorOverloading(2);
		ConstructorOverloading ob2 = new ConstructorOverloading(2,3);
	}

}

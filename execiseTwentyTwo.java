package com.emp;
class Books{
	
	void run() {
		System.out.println("books not in stock : ");
	}
}


public class execiseTwentyTwo extends Books{
	
	void run() {
		System.out.println("books are available :");
	}

	public static void main (String[] args){
		
		 execiseTwentyTwo ob = new  execiseTwentyTwo ();
		 ob.run();
			}


	}



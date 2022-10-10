package com.emp;
class City {
	 String name;
	 String population;
	 
	 void display() {
		 System.out.println("city name"+name);
		 System.out.println("population"+population);
	 }
	
}

public class excerciseFourteen {
	public static void main(String[] args) {
		City metro1 = new City();
		City metro2 = new City();
		
		metro1.name="chennai";
		metro1.population="7985378647";
		System.out.println("Details of metro1 city");
		metro1.display();
		
		metro2.name = "Bangalore";
		metro2.population = "7799543899967";
		System.out.println("DEtails of metro2 city");
		metro2.display();
		}

}



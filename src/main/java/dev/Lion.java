package dev;

import java.util.ArrayList;

public class Lion extends Animal {//Inheritance reduces a lot of redundancy
	
	private static int ashley = 3;
	
	public void legs() {
		super.legs();//Use the super keyword to access the super class that is being extended. This will give 
		//access to its methods.
			
	}
	public static String LionCubs(ArrayList<String> a)
	{
		
		return "This is all the Lion babies " + a;
	}
	
	public static void lionColor(String lionColor) {
		switch(lionColor) {
		case "white":
			System.out.println("This lion is unique");
			break;
		case "blue":
			System.out.println("This lion has been painted by roger");
			break;
		case "green":
			System.out.println("This lion has been painted by Tiffany");
			break;
		default:
			System.out.println("no lion color");
		}
	}

}

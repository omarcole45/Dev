package dev;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * HashMap
 * Create a hashtable and pass the table to the set collection and print the key and value separately using the iterator.
 * Java collections - LIST(ArrayList-LinkedList-Vector, implements list interface) , SET(HashSet-LinkedHashSet-TreeSet
 * ), and map(HashMap-TreeMap-LinkedHashMap). 
 * @author EO0K
 *
 */

public class MyDev {
	
static int []a = {1,2,3,4};//Variable declared inside of method.

	public static void main(String[] args) {
		Cub c = new Cub();//Declaring instance for 'Cub' class.
		cardType card = new cardType();
		//System.out.println("This is valid " + card.isValid("()"));
		System.out.println("This is perfect square " + card.isSquare(91567433));
		System.out.println("This is highes profit " + card.minMax(new int[] {1,2,3,4,5}));
		
		System.out.println("Card Type is " + card.getCardType("470000000000000"));//Testing Card Type problem.
		//Cub.dupValue(a);//Not sure what method is being tested here.
		
		ArrayList<String> lc = new ArrayList<String>();//Declaring an arrayList
		lc.add("Little billy");//Adding elements to array list.
		lc.add("little tom");//Adding elements to array list.
		lc.add("little roger");//Adding elements to array list.
		
//		for(String lcubs : lc) {
//			System.out.println(lcubs);
//		}
		
		Lion l = new Lion();//Declaring instance for 'Lion' class.
		//System.out.println(l.LionCubs(lc));//Test the LionCubs method.
		
		l.lionColor("jack");//Test the lionColor method.
		
		//MyDev.hashMapSample();//I am calling the 'hashMapSample' method, I declared this method as static,
		//and now I am able to access it without creating an instance of the class.
		
		hashMap hash = new hashMap();//Created a new class for the below method to be called, so this is an instance.
		
		hash.hashMapSample();// old comment: I am calling the 'hashMapSample' method, I declared this method as static,
		//and now I am able to access it without creating an instance of the class.
		
		TryCatchUsage tryUsage = new TryCatchUsage();
		tryUsage.eyes();
		
		int a[] = {2,5,5,5,4,6,6,9,4};//5 occurs 3 times and 6 occurs 2 times. implement a way to count the duplicate values.

	}
 

}

package dev;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayLinkedList {
	/**
	 * Difference between array and arrayList, is that you can dynamically add and decrease from arrayList where as in 
	 * the traditional array, its a fixed size and you cannot add or decrease.
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();//This is initializing the arrayList and declaring its Type which is 
		//<String>.
		al.add("jack");
		al.add("mon");
		al.add("pop");
		al.add("jill");
		
		System.out.println(al);
		
		al.add(1, "trell");
		
		System.out.println(al);
		
		al.remove("jill");
		System.out.println(al);
		System.out.println("This is the size of the array " + al.size());//This is how I find the size of ArrayList.
		
		System.out.println(al.contains("jack"));
		String total = " ";
		for (String als : al) {
			System.out.println(als);
			total = als;
		}
		
		
		

	}
	
	

}

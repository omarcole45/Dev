package dev;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayLinkedList2 {
	/**
	 * Difference between array and arrayList, is that you can dynamically add and decrease from arrayList where as in 
	 * the traditional array, its a fixed size and you cannot add or decrease.
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("this is the list " + ArrayLinkedList2.arryLink());
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		
		System.out.println(al);
		
		al.add(1, 3);
		
		System.out.println(al);
		
		al.remove(4);
		System.out.println(al);
		System.out.println("This is the size of the array " + al.size());//This is how I find the size of ArrayList.
		
		System.out.println(al.contains(4));
		int total;
		for (int als : al) {
			//System.out.println(als);
			total = als;
			System.out.println("this is the total " + total);
		}
		
		

	}
	public static int arryLink() {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		
		System.out.println(al);
		
		al.add(1, 3);
		
		System.out.println(al);
		
		al.remove(4);
		System.out.println(al);
		System.out.println("This is the size of the array " + al.size());//This is how I find the size of ArrayList.
		
		System.out.println(al.contains(4));
		int total = 0;
		for (int als : al) {
			//System.out.println(als);
			total = als;
			//System.out.println("this is the total " + total);
		}
		return total;
	}
	
	

}

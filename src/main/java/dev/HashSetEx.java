package dev;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {
	
	/**
	 * HashSet, treeset, LinkedHashSet, implements Set interface. The differences between Linked and Set is that 
	 * Set does not accept duplicate values
	 * 
	 * There is no guarantee that elements are added in sequential ordered in Set. They may store in random order.
	 * You wont see the 'get' method with this interface because you dont control the order of the indexed elements
	 * so if you dont want to accept duplicates, use this java collection.
	 * @param args
	 */

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("jack");
		hs.add("john");
		hs.add("Larry");
		hs.add("mike");
		System.out.println(hs);
		
		System.out.println(hs.isEmpty());//you can check to see if it empty
		
		hs.remove("jack");//you can remove
		
		System.out.println(hs);
		
		Iterator<String> hi = hs.iterator();//Use Iterator class to traverse through set
		
		while(hi.hasNext()) //This will traverse through set as long as condition is true
		{
			System.out.println(hi.next());//This will store and print objects in the set.
			
		}
		
		
		

	}

}

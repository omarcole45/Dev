package dev;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashMap {
	
	/**
	 * HashMap
	 * Create a hashtable and pass the table to the set collection and print the key and value separately using the iterator.
	 * Java collections - LIST(ArrayList-LinkedList-Vector, implements list interface) , SET(HashSet-LinkedHashSet-TreeSet
	 * ), and MAP(HashMap-TreeMap-LinkedHashMap). 
	 * @author EO0K
	 *
	 */
	
	public void hashMapSample() {
		HashMap<Integer, String> ms = new HashMap<Integer, String>();//Declaring a HashMap inside of method, which takes,
		//a Integer and String value.
		ms.put(0, "john");//Putting elements in HashMap, using Key and value.
		ms.put(1, "jack");
		ms.put(2, "billy");
		ms.put(43, "jan");
		ms.put(87, "zach");
		ms.put(12, "tyrone");
		ms.put(10, "sharon");
		ms.put(11, "shirley");
		ms.put(33, "sandra");
		
		Set sn = ms.entrySet();//Converting the HashMap into a set. so 'sn' variable is an object of Set that points
		//to the entrySet.
		
		Iterator it = sn.iterator();//We are iterating through the set.
		
		while(it.hasNext()) {//We are using the while loop to traverse 
			Map.Entry me = (Map.Entry)it.next();//This prints the Key and value separately.
			System.out.println(me.getKey());
			System.out.println(me.getValue());
		}
	}
	
}

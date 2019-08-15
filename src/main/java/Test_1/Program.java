package Test_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Program {

	private static String studentname1 = "Randy";//this is a field variable.
	
	public static void main(String[] args) {
	
		student("Jack");
		foreignStudent("Randy");
	}
	
	public static void student(String s){
		
		String studentname1 = "Jack";//This is a local variable but has the same name as the global static variable, looks like there is no issue with this.
		
		HashMap hashmap = new HashMap();
		
	if (studentname1==s) {
		
		hashmap.put(0, s);
		hashmap.put(1, "Jill");
		
		Set sn = hashmap.entrySet();
		
		Iterator it = sn.iterator();
		
		while(it.hasNext()) {
			Map.Entry me = (Map.Entry)it.next();
			 System.out.println(me.getValue());
			 System.out.println(me.getKey());
			
		}
			
		
		}else {
			System.out.println("Incomplete");
			
			
		}
		// if(studentname1 == s) ? System.out.println("Completed") : System.out.println("Incomplete");
		
		
		
	

}
	public static void foreignStudent(String a) {//It seems that if the method is static, the global variable should be static
		if(a==studentname1) {
			
			ArrayList<String> arr = new ArrayList<String>();
			
			arr.add(a);
			arr.add("Moss");
			
			for(String arrs : arr) {
				int totalLength = arrs.length();
				System.out.println("This is total length " + totalLength);
				
				
			}
			
		}
		
	}
	public static void foreignStudentParis(String a) {
		if(a==studentname1) {
			System.out.println("this is a foreign student");
			
		}
		
	}
}

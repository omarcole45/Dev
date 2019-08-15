package randomPractice;

import java.util.ArrayList;

public class MoneyAdding {

	public static void main(String[] args) {
		System.out.println(MoneyAdding.reverseStringCopy("it is a test string"));
		
		
//		MoneyAdding mon = new MoneyAdding();
//		int totalMoney = MoneyAdding.addMoney(2);//This can be accessed in a static way instead of creating an object of the class because the below method is static, so it can be accessed in a static way.
//		System.out.println(totalMoney);

	}
	public static int addMoney(int money){

		return 2 + money;
		}
	
	public static String reverseString(String reverse){//Take a string
		String newReverse = " ";//Declare and initialize variable outside of the for loop.
		for(int i=reverse.length()-1; i>=0; i--) {//Traverse backwards through the string
			newReverse += reverse.charAt(i); //Use declared variable and store reversed value
		}
		return newReverse;//return the reversed value back to the method.
	
		}
	public static String reverseStringCopy(String reverse){//Take a string
		ArrayList<String> r = new ArrayList<String>();//declare an array list
		r.add(reverse);//add the String to the array list
		String total = " ";//declare an empty variable
		for(String rs : r) {//traverse throw the array list
			if(rs.contains("test")) {//if the array list contains the given string, 
				total = rs;//then add that string to the declared variable in the method
			}else {//or else print the below
				System.out.println("this is not right");
			}
			
		
		}
		return total;//return the new value of total if the condition is met.
	
		}
}

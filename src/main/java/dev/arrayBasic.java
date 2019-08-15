package dev;

public class arrayBasic {
	public static void main(String[] args) { //array is a container that store multiple values of same data type. with this here "[]" you are saying you taking multiple values in this bracket
		
		//int a = 3; This holds only a single value but the array below takes more
		
		int a[] = new int[5]; //declare/initialize the array. you have to create space for those values. Like saying [5], which saying I want to allocate 5 integer members in this array. *new* allocates space
        
		a[0] = 2;
		a[1] = 3;
		a[2] = 4;
		a[3] = 5;
		a[4] = 6;
	
		
		for(int i=0; i<a.length; i++) {//This how i want to traverse through the array to find the values.
			System.out.println(a[i]);//traverse through the array to find the values and print out the value of i
		}
		
		int b[] = {2,3,4,5}; // This is the array literal, a simple way of defining and array.
		
		for(int i=0; i<b.length; i++) {
			System.out.println(b[i]);
		}
	}

}

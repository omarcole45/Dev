package dev;

public class MultiDemensionArrayRefactored {
	public static int abc[] [] = {{2,3,4}, {3,4,7}, {1,2,9}}; //I declared an array using object literals or array literals
	  // I set a point on the array at '7' because thats next to the greatest.
	 
	public static void main(String[] args) {
		
		/**
		 * Find the max value in the matrix.
		 * *Please refer to 'matrix' file for matrix.
		 */
		MultiDemensionArrayRefactored md = new MultiDemensionArrayRefactored();
		md.looping(abc);
	}
	public void looping(int [] []a) {//We declared an method that doesnt return anything and accepts a array as parameter.
		int max = abc[1][2];//Here I set a point of the given array to start at which is 7, and anything over is max.
		
		 for(int i=0; i<3; i++) {//I then traverse through the loop using a for loop. This is a loop for the row.
			 for(int j=0; j<3; j++) { //This is now a loop for the column. Basically I have made a nested loop. A loop inside a loop.
				 if(a[i][j]>max) {//Now I have made a condition that says if whatever point that matrix is on is greater than the declared max. Then proceed to next block of code in the condition.
					 max = a[i] [j];//Assign the value to the max. *new note - we cannot use this.max because the method is static.
				 }
			 }
		 }
		 System.out.println(max);//Print out max.//I need it to print once it comes out of the outter loop. Hence
		 //that is why it is placed under the above curly brace. If its placed under the curly braces before the above,
		 //then it will keep printing multiple values for 'max' variable. *Run in debug mode to see clearer picture*
		 
	}
 
/**
 * I can debug to see what is happening step by step to get a clearer picture of what is going on.
 */
 
}

package dev;

public class MultiDemensionArrayExercise {

	public static void main(String[] args) {
		
		/**
		 * Find the max value in the matrix.
		 * *Please refer to 'matrix' file for matrix.
		 */
		
 int abc[] [] = {{2,3,4}, {3,4,7}, {1,2,9}}; //I declared an array using object literals or array literals
 int max = abc[1][2]; // I set a point on the array at '7' because thats next to the greatest.
 
 for(int i=0; i<3; i++) {//I then traverse through the loop using a for loop. This is a loop for the row.
	 for(int j=0; j<3; j++) { //This is now a loop for the column. Basically I have made a nested loop. A loop inside a loop.
		 if(abc[i][j]>max) {//Now I have made a condition that says if whatever point that matrix is on is greater than the declared max. Then proceed to next block of code in the condition.
			 max = abc[i] [j];//Assign the value to the max. *new note - we cannot use this.max because the method is static.
		 }
	 }
 }
 System.out.println(max);//Print out max.
/**
 * I can debug to see what is happening step by step to get a clearer picture of what is going on.
 */
 }
}

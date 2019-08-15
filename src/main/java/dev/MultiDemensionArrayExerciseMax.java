package dev;

public class MultiDemensionArrayExerciseMax {

	public static void main(String[] args) {
		
		/**
		 * This is how you loop through and print a multi dememsional array from a matrix.
		 * Find the min number in the matrix.
		 */
		
		 //Looking to find the minimum number in this matrix.
		
		//a[row] [column] these is called x and y.
		
		//int a[] [] = new int [2] [3];
		int abc[] [] = {{2,3,4}, {3,4,7}, {1,2,9}};//Another way to declare multi demensional array with object literal.
		
		int min = abc[0] [0];//This sets the starting point of the matrix which value is 2. *refer to notepad "matrix" file.
		
		//System.out.println(a[0] [1]);
		
		for(int i=0; i<3; i++) {//This Loop will loop 2 times for the row. Basically traversing
			
			for(int j=0; j<3; j++) {//This inner for Loop will Loop 3 times for the Column. Basically traversing
				
				if(abc [i] [j]<min) {//2 is what is being compared
					
					min = abc[i][j];
				}
			}
		}
		System.out.println(min);//Run in debug mode to get a better picture.

	}
	/**
	 * If i put '0' in the matrix, it will print '0' as the min number then. 
	 */

}

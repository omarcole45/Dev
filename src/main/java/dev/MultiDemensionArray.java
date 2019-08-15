package dev;

public class MultiDemensionArray {

	public static void main(String[] args) {
		
		/**
		 * This is how you loop through and print a multi dememsional array.
		 */
		
		//a[row] [column] these is called x and y.
		
		//int a[] [] = new int [2] [3];
		int a[] [] = {{2,3,4}, {5,6,7}};//Another way to declare multi demensional array with object literal.
		
		a[0] [0] = 2;
		a[0] [1] = 3;
		a[0] [2] = 4;
		a[1] [0] = 5;
		a[1] [1] = 6;
		a[1] [2] = 7;
		
		//System.out.println(a[0] [1]);
		
		for(int i=0; i<2; i++) {//This Loop will loop 2 times for the row.
			
			for(int j=0; j<3; j++) {//This inner for Loop will Loop 3 times for the Column.
				System.out.println(a[i] [j]);
			}
		}

	}

}

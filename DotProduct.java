package com.test;

public class DotProduct {
	
	public static void main(String [] args) {
       int[] array1 = new int[] {1, 2};
       int[] array2 = new int[] {2, 3};
       System.out.println(dotProduct(array1,array2));

	}
	 static long dotProduct( int[] array1, int array2[] ){
		 long array1Mul = 1;
		 long array2Mul = 1;
		 for(int element : array1) {
			  array1Mul *=element ;
		 }
		 for(int element : array2) {
			  array2Mul *=element ;
		 }
		 return array1Mul + array2Mul;
     }

}

package com.test;

import java.util.Arrays;

public class DistanceBetweenString {

	public static void main(String[] args) {
		String document = "In publishing and graphic design, lorem ipsum is a filler text commonly used to demonstrate the graphic elements";

		shortestDistance( document, "is", "a" );


	}
	
	public static double shortestDistance(String document, String word1, String word2) {
		String [] documentInWord = document.split(" ");
		int index1 = -1;
		int index2 = -1;
		double result = 0 ;
		for(int i=0;i<documentInWord.length;i++) {
			if(documentInWord[i].equalsIgnoreCase(word1)) {
				index1 = i;
			}
			if(documentInWord[i].equalsIgnoreCase(word2)) {
				index2 = i;
			}
		}
		for(int i = index1+1;i<index2;i++) {
			result += documentInWord[i].length() + 1;
		}
		
		 result += ((word1.length()) /2.0) + ((word2.length())/2.0) + 1;
		
		System.out.println(result);
		return result;
    }
	
	
	


}

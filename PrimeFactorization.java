package com.test;

import java.util.ArrayList;
import java.util.Arrays;

public class PrimeFactorization {
	
	public static void main(String []  args) {
		primeFactorization(12);
	}
	
	
    public static ArrayList<Integer> primeFactorization(int x) {
    	
    	ArrayList<Integer> result = new ArrayList<>();
    	
    	boolean checkCondition = true;
    	int i = 2;
    	while(checkCondition) {
    			if(x % i == 0) {
        			result.add(i);
        			x /= i;
        		}else
        			i++;
        		if(x == 1)
        			checkCondition = false;
    	}
    	
    		System.out.println(result);
    	return result;
    	
    	
    }



}

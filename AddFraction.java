/**
 * 
 */
package com.test;

import java.util.Arrays;

/**
 * @author Pranay_Jaiswal
 *
 */
public class AddFraction {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       int[] fraction1 = new int[] {2, 3};
       int[] fraction2 = new int[] {8, 3};
    
       System.out.println(Arrays.toString(addFractions(fraction1,fraction2)));

}
	

    static int[] addFractions ( int[] fraction1, int[] fraction2 ){
    	int lcm = lcm(fraction1[1],fraction2[1]);
    	int num =  ((lcm * fraction1[0])/fraction1[1]) + ((lcm * fraction2[0])/fraction2[1]);
    	return new int[] {num,lcm};
    }
    
    static int lcm(int a, int b) {
    	return (a*b)/hcf(a,b);
    }
    
    static int hcf(int x,int y) {
    	if(x==0)
    		return y;
    	else
    		return hcf(y%x,x);
    }

}

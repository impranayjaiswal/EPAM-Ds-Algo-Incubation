package com.test;

public class PowerOfExpo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(power(2,4));
	}
	
	public static double power(double base, int exp) {
		double result = 1;

		while(exp >= 0) {
			result *= base;
			exp--;
		}
		return result;
	}


}

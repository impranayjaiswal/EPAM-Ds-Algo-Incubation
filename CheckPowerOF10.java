package com.test;

public class CheckPowerOF10 {
	
	public static void main(String[] args) {
		System.out.println(checkPowerOfTen(10000000));
	}
	
	static boolean checkPowerOfTen(long x) {
		if(x % 10 != 0 || x == 0)
			return false;
		if(x/10 == 1 )
			return true;
		return checkPowerOfTen(x/10);
		
	}

}

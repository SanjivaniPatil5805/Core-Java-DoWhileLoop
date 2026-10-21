package com.practice.dowhileloop;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int num = 352;
		int rev = 0;
		
		do {
			
			int digit = num % 10;
			rev = rev * 10 + digit;
			num = num / 10;
			
			
		} while(num >= 1);
		
		System.out.println(rev);
		
	}
	
}

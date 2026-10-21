package com.practice.dowhileloop;

public class PalindromNumber {

	public static void main(String[] args) {
		
		int num = 909;
		int rev = 0;
		int temp = num;
		
		do {
			
			int digit = num % 10;
			rev = rev * 10 + digit;
			num = num / 10;
			
		} while(num >= 1);
		
		if(temp == rev) {
			
			System.out.println("Palindrom Number");
			
		} else {
			
			System.out.println("Not a Palindrom Number");
			
		}
		
		
	}
	
}

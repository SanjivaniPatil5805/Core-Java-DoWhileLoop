package com.practice.dowhileloop;

public class SumOfDigitsOfNumber {

	public static void main(String[] args) {
		
		int num = 456;
		int sum = 0;
		
		do {
			
			int digit = num % 10;
			sum = sum + digit;
			num = num / 10;
			
		} while(num >= 1);
		
		System.out.println(sum);
		
	}
	
}

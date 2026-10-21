package com.practice.dowhileloop;

public class CountTheDigitsOfNumber {

	public static void main(String[] args) {
		
		int num = 4530994;
		int count = 0;
		
		do {
			
			num = num / 10;
			count++;
			
		} while(num >= 1);
		
		System.out.println(count);
		
		
	}
	
}

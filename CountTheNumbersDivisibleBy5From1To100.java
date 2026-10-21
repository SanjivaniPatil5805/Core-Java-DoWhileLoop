package com.practice.dowhileloop;

public class CountTheNumbersDivisibleBy5From1To100 {

	public static void main(String[] args) {
		
		int i = 1;
		int count = 0;
		
		do {
			
			if(i % 5 ==0) {
				
				count++;
				
			}
			
			i++;
			
		} while(i<=100);
		
		System.out.println("Count of Numbers Divisible by 5 From 1 to 100 = "+count);
		
	}
	
}

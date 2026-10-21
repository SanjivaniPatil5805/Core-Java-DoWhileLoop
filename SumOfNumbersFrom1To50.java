package com.practice.dowhileloop;

public class SumOfNumbersFrom1To50 {

	public static void main(String[] args) {
		
		int i = 1;
		int sum = 0;
		
		do {
			
			sum += i;
			i++;
			
		} while(i<=50);
		
		System.out.println("Sum of Numbers from 1 To 50 = "+sum);
		
	}
	
}

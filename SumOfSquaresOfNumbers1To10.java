package com.practice.dowhileloop;

public class SumOfSquaresOfNumbers1To10 {

	public static void main(String[] args) {
		
		int i = 1;
		int sum = 0;
		int square;
		
		do {
			
			square = i * i;
			
			sum += square;
			
			i++;
			
		} while(i<=10);
		
		System.out.println("Sum of squares of numbers from 1 to 10 = "+sum);
		
	}
	
}

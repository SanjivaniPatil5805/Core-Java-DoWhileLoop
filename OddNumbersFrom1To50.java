package com.practice.dowhileloop;

public class OddNumbersFrom1To50 {

	public static void main(String[] args) {
		
		int i = 1;
		
		do {
			
			if(i % 2 == 1) {
				
				System.out.println(i);
				
			}
			
			i++;
			
		} while(i<=50);
		
	}
	
}

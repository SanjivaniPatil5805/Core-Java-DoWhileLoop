package com.practice.dowhileloop;

public class LCM {

	public static void main(String[] args) {
		
		int a = 4;
		int b = 6;
		
		int n;
		
		if(a > b) {
			
			n = a;
			
		} else {
			
			n = b;
			
		}
		
		int lcm = n;
		
		do {
		
			if(n % a == 0 && n % b == 0) {
				
				lcm = n;
				break;
				
			} 
				
		   n++;
				
			
		} while (true);
		
		System.out.println("LCM  = "+lcm);
		
	}
	
}

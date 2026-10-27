package com.practice.dowhileloop;
import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two Numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int n, i = 1, gcd = 1;
		
		if(a < b) {
			
			n = a;
			
		} else {
			
			n = b;
			
		}
		
		do {
			
			if(a % i == 0 && b % i == 0) {
				
				gcd = i;
				
			}
			
			i++;
			
		} while(i <= n);
		
		System.out.println("GCD of "+ a+ " and "+ b+ " is "+gcd);
		
		sc.close();
		
	}
	
}

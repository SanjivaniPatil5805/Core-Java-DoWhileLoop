package com.practice.dowhileloop;

public class DecimalToBinary {

	public static void main(String[] args) {
		
	    int num = 12;
	    	String	binary = "";
	    
	    do {
	    	
	    	int rem = num % 2;
	    	binary = rem + binary;
	    	num = num / 2;
	    	
	    }while(num != 0);
	    
	    System.out.println(binary);
	   
	}
	
}

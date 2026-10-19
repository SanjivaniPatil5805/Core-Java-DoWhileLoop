package com.practice.dowhileloop;

public class CubesOfNumbers {

	public static void main(String[] args) {

		int i = 1;

		do {

			System.out.println(i + " * " + i + " = " + (i * i * i));

			i++;

		} while (i <= 10);

	}

}

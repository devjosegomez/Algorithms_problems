package com.recursion.app;

import java.util.Scanner;

public class Algorithms {

	public static void main(String[] args) {
		int number = 0; 
		
		Scanner input = new Scanner(System.in);
		Recursion recursion = new Recursion();
		
		
		System.out.println("Enter the number to sum: ");
		number = input.nextInt();
		
		System.out.println("Result with recursion: " + recursion.sum(number));
		System.out.println("Result with for: " + recursion.sumWithFor(number));
		
		//close scanner
		input.close();
	}
}

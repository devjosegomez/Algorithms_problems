package com.recursion.app;

import java.util.Scanner;

public class Algorithms {

	public static void main(String[] args) {
		int number = 0; 
		
		Scanner input = new Scanner(System.in);
		Recursion recursion = new Recursion();
		
		//Sum methods
		System.out.println("Enter the number to sum: ");
		number = input.nextInt();
		
		System.out.println("Sum...");
		System.out.println("Result with recursion: " + recursion.sum(number));
		System.out.println("Result with for: " + recursion.sumWithFor(number));
		
		//Stacking methods
		System.out.println("Enter a number to Stack: ");
		number = input.nextInt();
		
		System.out.println("Stacking...");
		System.out.println("-Asc order: ");
		recursion.buildLayerAsc(number);
		
		//close scanner
		input.close();
	}
}

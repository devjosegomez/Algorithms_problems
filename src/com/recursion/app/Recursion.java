package com.recursion.app;

public class Recursion {
	//Add the first N numbers using recursive function
	public int sum(int N) {
		if(N ==1) return 1;
		return N + sum (N - 1);
	}
	
	//Add the first N numbers using a for without recursive
	public int sumWithFor(int N) {
		int result = 0;
		for(int i=1; i<=N; i++) 
			result +=i;
		
		return result;
	}
	
	//Stacking numbers in Ascending order
	
	public void buildLayerAsc(int N) {
		if(N == 0) return;
		
		buildLayerAsc(N-1);
		
		System.out.println(N);
	}
	
	//Stacking numbers in Descending order
	public void buildLayerDesc(int N) {
		if(N == 0) return;
		
		System.out.println(N);
		
		buildLayerDesc(N-1);
	}
	
	//Factorial 
	public int factorial(int N) {
		if(N == 1) return 1;
		
		return N * factorial(N-1);
	}
	
	//Factorial with accumulator (faster solution)
	public int factorialAccumulator(int accumulator, int N) {
		if(N == 1) return accumulator;
		
		return factorialAccumulator(accumulator * N , N-1);
	}
	
	//Only return the results this way is faster
	public int fasterFactorial(int N) {
		return factorialAccumulator(1, N );
	}
}

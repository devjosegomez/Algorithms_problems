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
}

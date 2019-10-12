package com.recursion.app;

public class Recursion {
	//Add the first N numbers using recursive function
	public int sum(int N) {
		if(N ==1) return 1;
		return N + sum (N - 1);
	}
}

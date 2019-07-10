package com.company.app;

public class Calculator {

	public int add(int x, int y) {
		return x + y;
	}
	
	public int subtract(int x, int y) {
		return x - y;
	}
	
	public int multiply(int x, int y) {
		return x * y;
	}
	
	//Hot fix is needed
	public int divide(int x, int y) {
		if(y == 0) {
			System.out.println("Denominator cannot be zero");
		}
		return x / y;
	}
}


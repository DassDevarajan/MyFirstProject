package com.company.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

@DisplayName("Basic Calculator")
class CalculatorTest {

	private Calculator calc;
	
	@BeforeEach
	public void init() {
		calc = new Calculator();
	}
	
	@Test
	public void addition() {
		assertEquals(30, calc.add(20, 10));
	}
	
	@Test
	public void subtraction() {
		assertEquals(20, calc.subtract(50, 30));
	}
	
	@Test
	public void multiplication() {
		assertEquals(50, calc.multiply(25, 2));
	}
	
	@Test
	public void division() {
		assertEquals(20, calc.divide(100, 5));
	}
}

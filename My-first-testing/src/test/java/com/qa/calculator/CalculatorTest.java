package com.qa.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class CalculatorTest {
	@Test
	public void multiplyTestWithTwoTwo() {
		Calculator calculator = new Calculator();
		assertEquals(4, calculator.multiply(2, 2));
	}
	
	@Test
	public void multiplyTestWithThreeAndTwo() {
		Calculator calculator = new Calculator();
		assertEquals(6, calculator.multiply(3, 2));
	}

	@Test
	public void divisionWithTenAndTwo() {
		Calculator calculator = new Calculator();
		assertEquals(5, calculator.divsion(10, 2));
	}
	
	@Test
	public void additionWithFiveAndFive() {
		Calculator calculator = new Calculator();
		assertEquals(10, calculator.addition(5, 5));
	}
	//@Ignore - Ignores test
	@Test
	public void subtractionWithThreeAndTwo() {
		Calculator calculator = new Calculator();
		assertEquals(1, calculator.subtraction(3, 2));
	}
	
	@Test(expected = ArithmeticException.class)
	public void divideByZero() {
		calc.divsion(5,0);
	}
	
	private Calculator calc; // - needs to be at the top
	@Before
	public void setUp() {
		calc = new Calculator();
	}
	
//	public void method() {
//		String str = "apple";
//		str.
}


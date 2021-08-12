package com.fis.springsecurity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	public void testAdd() {
		Calculator calc = new Calculator();
		int actual = calc.add(10, 10);
		assertEquals(30, actual);
	}

	@Test
	public void testNegativeAdd() {
		Calculator calc = new Calculator();
		int actual = calc.add(-10, 10);
		assertEquals(0, actual);
	}

	@Test
	public void testSub() {
		Calculator calc = new Calculator();
		int actual = calc.sub(10, 10);
		assertEquals(0, actual);
	}

	@Test
	public void testMul() {
		Calculator calc = new Calculator();
		int actual = calc.mul(10, 10);
		assertEquals(100, actual);
	}

	@Test
	public void testDiv() {
		Calculator calc = new Calculator();
		int actual = calc.div(10, 10);
		assertEquals(1, actual);
	}

}

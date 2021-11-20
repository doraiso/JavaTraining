package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

import algorithm.Calculator;

public class CalculatorTest extends Calculator {

	@Test
	public void multiplyで乗算結果が取得できる() {
		Calculator calc = new Calculator();
		int expected = 12;
		int actual = calc.multiply(3, 4);
		assertEquals(actual, expected);
	}

	@Test
	public void divideで3と2の除算が出来る() {
		Calculator calc = new Calculator();
		float expected = 1.5f;
		float actual = calc.divide(3, 2);
		assertEquals(actual, expected);
	}

	@Test(expected = IllegalArgumentException.class)
	public void divideで5と0のときにIllegalArgumentExceptionを送出する()
	{
		Calculator calc = new Calculator();
		calc.divide(5, 0);
	}

}

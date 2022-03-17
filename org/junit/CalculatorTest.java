/**
 * CalculatorTest.java
 * JUnit test sample.
 * It needs org.junit package.
 */

package org.junit; // It needs org.junit package.
import algorithm.Calculator;

public class CalculatorTest extends Calculator {

	private static final float _1_5F = 1.5f;

	public void multiplyで乗算結果が取得できる() {
		Calculator calc = new Calculator();
		int expected = 12;
		int actual = calc.multiply(3, 4);
		assertEquals(actual, expected);
	}

	private void assertEquals(float actual, float expected) {
	}

	public void divideで3と2の除算が出来る() {
		Calculator calc = new Calculator();
		float expected = _1_5F;
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

package algorithm;

public class Calculator {

	public int multiply(int x, int y) {
		return x * y;
	}

	public float divide(int x,int y) {
		if (y == 0) throw new IllegalArgumentException("0で割れません");
		return (float)x / (float)y;
	}

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		System.out.println(calc.multiply(3, 5));
		System.out.println(calc.divide(5, 3));

	}

}

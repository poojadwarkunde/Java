package practice.java;

public class FibonacciSeries {

	public static void main(String[] args) {
		fib(100);
	}

	private static void fib(int till) {
		int a = 0;
		int b = 1;
		int c = 1;
		while (c < till) {
			System.out.println(c);
			c = a + b;
			a = b;
			b = c;
		}
	}
}
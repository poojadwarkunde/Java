package practice.java.numericexamples;

public class FactorialNumber {

	public static void main(String[] args) {
		System.out.println(factorial(5));
		System.out.println(rec_fact(5));
		System.out.println(factWhile(5));
	}

	private static int factWhile(int num) {
		int fact = 1;
		int i = 2;
		while (i <= num) {
			fact = fact * i;
			i++;
		}
		return fact;
	}

	private static int rec_fact(int num) {
		if (num == 1) {
			return 1;
		}
		return num * rec_fact(num - 1);
	}

	private static int factorial(int num) {
		int fact = 1;
		for (int i = 2; i <= num; i++) {
			fact = fact * i;
		}
		return fact;
	}

}

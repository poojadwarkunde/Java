package practice.java.numericexamples;

public class FactorialNumber {

	public static int factWhile(int num) throws Exception {
		if(num < 0) {
			throw new Exception("Number can't be negative");
		}
		int fact = 1;
		int i = 2;
		while (i <= num) {
			fact = fact * i;
			i++;
		}
		return fact;
	}

	public static int rec_fact(int num) {
		if (num == 1) {
			return 1;
		}
		return num * rec_fact(num - 1);
	}

	public static int factorial(int num) {
		int fact = 1;
		for (int i = 2; i <= num; i++) {
			fact = fact * i;
		}
		return fact;
	}

}

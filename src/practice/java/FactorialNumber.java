package practice.java;

public class FactorialNumber {

	public static void main(String[] args) {
		factorial(5);
		System.out.println(rec_fact(5));
	}

	private static int rec_fact(int i) {
		
		return i;
	}

	private static void factorial(int num) {
		int fact = 1;
		for(int i=2;i<=num;i++) {
			fact= fact*i;
		}
		System.out.println(fact);
	}

}

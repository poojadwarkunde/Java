package practice.java;

import java.util.Scanner;

public class FizzBuzz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int first = sc.nextInt();
		for (int i = 0; i < first; i++) {
			printFuzzBizz(sc.nextInt());
		}
		"".toCharArray();
		StringBuffer s = null;
		//System.out.println(char('a'+3));
	}

	private static void printFuzzBizz(int input) {
		for (int i = 1; i <= input; i++) {
			if (i % 3 != 0 & i % 5 != 0) {
				System.out.println(i);
			} else if (i % 3 == 0 & i % 5 == 0) {
				System.out.println("FizzBuzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				System.out.println("BuZZ");
			}
		}
	}

}

package practice.java.javaPkgOne;

public class Assignment3 {

	public static void main(String[] args) {
		assignment3_1();
		assignment3_2();
	}

	private static void assignment3_1() {
		for (int i = 1; i <= 3; i++) {
			for (int j = 3; j >= i; j--) {
				System.out.print(j + "\t");
			}
			System.out.println();
		}

	}

	private static void assignment3_2() {
		System.out.println();
		for (int i = 3; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print(j + "\t");
			}
			System.out.println();
		}

	}

}

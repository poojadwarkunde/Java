package java.practice.examples.array;

public class ArrayPracticeExamples {
	public static void main(String[] args) {
		int c[][] = new int[3][3];
		int a[][] = { { 1, 2, 3 }, { 1, 2, 3 }, { 1, 2, 3 } };
		int b[][] = { { 5, 6, 7 }, { 5, 6, 7 }, { 5, 6, 7 } };
//		add(a, b, c);
//		sub(a, b, c);
		print(a);
		System.out.println();
		print(b);
		System.out.println();
		print(c);
		System.out.println();
		mul(a,b,c);
	}

	private static void print(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print("\t" + a[i][j]);
			}
			System.out.println();
		}
		
	}

	private static void mul(int[][] a, int[][] b, int[][] c) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				for(int k = 0; k< a.length;k++) {
				c[i][j] += (a[i][j] * b[j][k]);
				}
				System.out.print("\t" + c[i][j]);
			}
			System.out.println();
		}

	}
//
//	private static void sub(int[][] a, int[][] b, int[][] c) {
//
//		for (int i = 0; i < a.length; i++) {
//			for (int j = 0; j < a.length; j++) {
//				c[i][j] = a[i][j] - b[i][j];
//				System.out.print("\t" + c[i][j]);
//			}
//			System.out.println();
//		}
//	}

//	public static void add(int a[][], int b[][], int c[][]) {
//		// Addition of 2 dimensional arrays
//		for (int i = 0; i < a.length; i++) {
//			for (int j = 0; j < a.length; j++) {
//				c[i][j] = a[i][j] + b[i][j];
//				System.out.print("\t" + c[i][j]);
//			}
//			System.out.println();
//		}

	//}

}

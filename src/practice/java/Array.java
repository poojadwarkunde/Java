package practice.java;

public class Array {

	public static void main(String[] args) {
		// Array declaration
		int[] arr = new int[5];
		arr[0] = 10;
		arr[2] = 30;
		arr[4] = 50;
		for (int i = 0; i < arr.length; i++) {
			System.out.print("  " + arr[i]);
		}
	}

}

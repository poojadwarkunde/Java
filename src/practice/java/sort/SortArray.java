package practice.java.sort;

public class SortArray {

	public static void main(String[] args) {
		int[] marks = { 10, 70, 80, 45, 67, 23, 87, 43 };
		boolean isAscending = true;
		print(marks);
		sortArray(marks, isAscending);
		System.out.println();
		print(marks);
	}

	private static void print(int[] marks) {
		for (int i = 0; i < marks.length; i++) {
			System.out.print(" " + marks[i]);
		}
	}

	private static void sortArray(int[] marks, boolean isAscending) {
		for (int j = 0; j < marks.length; j++) {
			for (int i = 0; i < marks.length - 1; i++) {
				if (isAscending ? marks[i] > marks[i + 1] : marks[i] < marks[i + 1]) {
					swap(marks, i, i + 1);
				}
			}
		}
	}

	private static void swap(int[] marks, int i, int j) {
		int temp;
		temp = marks[j];
		marks[j] = marks[i];
		marks[i] = temp;
	}
}

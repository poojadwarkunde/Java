package practice.java.javaPkgOne;

public class Assignment5 {

	public static void main(String[] args) {
		Assignment5 a5 = new Assignment5();
		System.out.println("Find 2 max and min values from the given array");
		a5.arrayMaxMin();
		System.out.println();
		System.out.println("Find substring from given string");
		a5.subStr();
		a5.nonStatcMthd();
		System.out.println();
		System.out.println("Find if no is prime or not");
		System.out.println(a5.isPrimeNo(43) ? "Prime No" : "Not Prime No");
		ClassA a = new ClassA();
		System.out.println();
		System.out.println("Acccess local variable from static method");
		System.out.println("local variable value is =" + a.method());
	}

	public boolean isPrimeNo(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public void nonStatcMthd() {

	}

	public void subStr() {
		String strInput = "Selenium is an Automation Tool";
		String searchStr = "Auto";
		System.out.println(searchSubString(strInput, searchStr) ? "Found" : "Not Found");
	}

	public boolean searchSubString(String strInput, String searchStr) {
		char charStringInput[] = strInput.toCharArray();
		char charStringSearch[] = searchStr.toCharArray();
		int i = 0;
		int j = 0;
		for (; i <= charStringSearch.length - 1 && j <= charStringInput.length - 1;) {
			if (charStringSearch[i] != charStringInput[j]) {
				j++;
			} else {
				i++;
				j++;
			}
		}
		if (charStringSearch.length == i)
			return true;
		else
			return false;
	}

	public void arrayMaxMin() {
		int arr[] = { 23, 12, 54, 18, 45, 76, 27, 9, 34, 56 };
		sort(arr);
		print(arr);
		min2(arr);
		max2(arr);
	}

	public void max2(int[] arr) {
		System.out.println(arr[arr.length - 1] + "  " + arr[arr.length - 2]);
	}

	private void min2(int[] arr) {
		System.out.println(arr[0] + "  " + arr[1]);

	}

	private void print(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++)
			System.out.print("  " + arr[i]);
		System.out.println();
	}

	private void sort(int arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j <= arr.length - i - 1; j++) {
				if (j != arr.length - 1) {
					if (arr[j] > arr[j + 1]) {
						swap(arr, j, j + 1);
					}
				}
			}
		}
	}

	private void swap(int[] arr, int j, int i) {
		int temp = 0;
		temp = arr[j + 1];
		arr[j + 1] = arr[j];
		arr[j] = temp;
	}

}

class ClassA {
	public int method() {
		int local = 20;
		return local;
	}
}

package practice.java.sort;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = { 4, 6, 12, 23, 45, 213, 576, 666, 777, 888, 999 };
		int s = 90;
		int start = 0;
		int end = arr.length;
		System.out.println("Found Element :" + binarySearch(arr, s, start, end));
	}

	private static boolean binarySearch(int[] arr, int s, int start, int end) {
		int mid = (start + end) / 2;
		if (arr[mid] == s) {
			System.out.println("No is found at " + mid);
			return true;
		} else if (end <= start) {
			return false;
		} else {
			if (s < arr[mid]) {
				end = mid-1;
			} else {
				start = mid+1;
			}
			return binarySearch(arr, s, start, end);
		}
	}

}

//
// Steps:
// 1. write main method and define integer array
// 2. enter 10 elements in array
// 3.
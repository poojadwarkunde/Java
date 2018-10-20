package practice.java;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		Object[][] arr = new Object[3][4];
		arr[0][0] = 1;
		arr[0][1] = "a";
		arr[1][2] = "Y";
		arr[1][3] = 10;
		arr[2][0] = 3;
		arr[2][2] = "z";
		arr[2][3] = 100.1;
		int row = arr.length;
		int column = arr[0].length;
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print("     " + arr[i][j]);
			}
			System.out.println();
		}
	}

}

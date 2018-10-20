package practice.java.javaPkgOne;

public class Assignment4 {

	public static void main(String[] args) {
		Assignment4 fb = new Assignment4();
		System.out.println("Print fibonacchi Series");
		fb.fibonacchi();
		System.out.println("Print First pattern");
		fb.pattern1();
		System.out.println("Print Second pattern");
		fb.pattern2();
	}

	/* Method to Print
	 * 3 2 1
	 * 3 2 
	 * 3
	 */

	public void pattern2() {
		for (int i=1;i<=3;i++) {
			for(int j=3;j>=i;j--) {
				System.out.print("  "+j);
			}
			System.out.println();
		}

	}
	/* Method to Print
	 * 3 2 1
	 * 2 1 
	 * 1
	 */

	public void pattern1() {
		int i=3; 
		while (i>=1)
		{int j=i;
			while (j>=1) {
				System.out.print("  "+ j);
				j--;
			}
			System.out.println();
			i--;
		}

	}
	/* Method to get fibonacchi series till 100*/
	public void fibonacchi() {
		int temp = 0;
		int j = 1;
		for (int i = 0; temp < 100;) {
			System.out.println(temp);
			temp = i + j;
			i = j;
			j = temp;
		}
	}
}

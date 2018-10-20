package practice.java.javaPkgOne;

public class ForPatternExamples {

	public static void main(String[] args) {
		ForPatternExamples fe = new ForPatternExamples();
		fe.pyramid();
		System.out.println();
		fe.invertedTriangle();
	}
		/*To print
		 * A B C
		 * A B
		 * A */
	public void invertedTriangle() {
		for (char i = 'C'; i >= 'A'; i--) {
			for (char j = 'A'; j <= i; j++)
				System.out.print(j + " ");
			System.out.println();
		}
	}
		
		/* To Print 
		 * 				1
		 * 			1		2
		 * 		1		2		3
		 */
	public void pyramid() {
		for (int i = 1; i <= 3; i++) {
			for (int s = 3 - i; s >= 1; s--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}


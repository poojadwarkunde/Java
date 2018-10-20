package practice.java.javaPkgOne;

public class IfClass {

	public static void main(String[] args) {
		int a = 43;
		int b = 51;
		int c = 40;
	//TO comapre age of 2 persons
		/*if(a>b) {
			//Statement
			System.out.println("A is older than B");
		}
		else if (b>a) {
			System.out.println("B is Older than A");
		} 
		else System.out.println("A and B are of same age");*/
		// TO Compare age of 3 persons
		if(a>b && a>c) System.out.println("A is older");
		else if (b>c) System.out.println("B is older");
		else System.out.println("C is older ");
	}

}

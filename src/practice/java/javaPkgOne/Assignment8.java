package practice.java.javaPkgOne;

class Assignment8 {
	public static void main(String[] args) {
		Assignment8 a8 = new Assignment8();
		// Write a program which should allow the user to specify addition of
		// values for a , b and c However,
		// if an error occurs, your program should catch that error and print an
		// error message.
		// Catch exception if any one of input from user is char, String,
		// Boolean.
		a8.example1(args);
		// Create a class, which holds 2 static & 2 non static method, call it
		// from different class,
		// 1st static method should throw arithmetic exception
		// 2nd static method should throw null pointer exception
		// 1st non static method should throw array out of bound exception
		// 2nd non static method should throw general exception
		// It should print all exception in each execution.
		// a8.example3();
//		a8.method1();
//		a8.method2();
//		 a8.method3();
//		 a8.method4();
	}

	private void method1() {
		
	}

	private void example1(String[] args) {
		try {
			int total;
			int a= Integer.parseInt(args[0]);
			int b= Integer.parseInt(args[1]);
			int c= Integer.parseInt(args[2]);
			total = a+b+c;
			System.out.println("Total is " + total);
		} catch (NumberFormatException | ArithmeticException e) {
			System.out.println("Catch Block");
			System.out.println(e);
		} finally {
			System.out.println("Finally block");
		}
	}
}
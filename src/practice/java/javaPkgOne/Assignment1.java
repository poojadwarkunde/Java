package practice.java.javaPkgOne;

public class Assignment1 {
	public static void main(String[] args) {
		assignment1_1();
		assignment1_2();
		assignment1_3();
		assignment1_4();
	}
	private static void assignment1_4() {
		int num1 = 19;
		int num2 = 45;
		System.out.println("Addition of "+ num1 + "and " + num2 + "is : " + (num1-num2));
		
	}
	//Add 2 numbers
private static void assignment1_3() {
		int num1 = 19;
		int num2 = 45;
		System.out.println("Addition of "+ num1 + "and " + num2 + "is : " + (num1+num2));
	}
// Create 8 data types of variables and Print
	private static void assignment1_2() {
		short s =12;
		byte b =11;
		int i=10;
		long l = 67;
		float f = 78.78f;
		double d = 67.90;
		char c ='P';
		boolean bn = false;
		System.out.println("Byte : " + b);
		System.out.println("Short : " + s);
		System.out.println("Int : " + i);
		System.out.println("Long : " + l);
		System.out.println("Float : " + f);
		System.out.println("Double : " + d);
		System.out.println("Char : " + c);
		System.out.println("Boolean : " + bn);
	}
// Print - You are in Knowledgeware
	private static void assignment1_1() {
		System.out.println("You are in Knowledgeware");
	}

}

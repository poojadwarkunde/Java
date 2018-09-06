package java.practice.examples.literals;

public class JavaPracticeExamplesIntegralLiterals {

	public static void main(String[] args) {
		int x= 0x10;
		System.out.println(x);System.out.println();
		int x1= 0X10; System.out.println(x1);System.out.println();
//		int x2=0786;System.out.println(x2);System.out.println(); The literal 0786 of type int is out of range 
		int x3=077;System.out.println(x3);System.out.println();
		int x4=0xface; System.out.println(x4);System.out.println();
		int x5 = 0XBEEF;System.out.println(x5);System.out.println();
//		int x6 = 0xBeer;System.out.println(x6);System.out.println(); //Syntax error on token "r", delete this token
		test1();
		test2();
		test3();
	}
private static void test3() {
byte b = 10; System.out.println(b);System.out.println();
byte b1 = 127; System.out.println(b1);System.out.println();
//byte b2 = 128;  System.out.println(b2);System.out.println(); Type mismatch: cannot convert from int to byte
short s =32767;  System.out.println(s);System.out.println();
//short s1 = 32768;  System.out.println(s1);System.out.println();Type mismatch: cannot convert from int to short
	}
private static void test2() {
		int x=10; System.out.println(x);System.out.println();
		long l =10l; System.out.println(l);System.out.println();
//		int x1 =10l;System.out.println(x1);System.out.println();//Type mismatch :cannot convert from long to int
		long l1 =10;System.out.println(l1);System.out.println();
	}
private static void test1() {
	int x=10;
	int y= 010;
	int z = 0x10;
	System.out.println(x +"..." +y+"..." + z);
	}
}
//
//Literals :
//	any constant value which can be assigned to variable is called literal
//	ex.  int x= 10; 
//	int = data type/keyword
//	x = name of variable/identifier
//	10 = constant value or literal
//	
//Integral Literal :
//	1. byte, short,int,long
//	2. int x=10; -- decimal literals
//	3. int x=010; -- Octal form :no prefixed with zero is considered as octal
//	4. int x = 0x10; -- hexadecimal : number pre-fixed with zero x is considered as hexadecimal (capital or small doesn't matter)

//by default every integral literal is of int type, we can specify explicit as long type by suffixed with l or L.
//there is not directory byte and short literals explicitly, but indirectly we can specify, whenever we are assigning integral to var and if the value within range of byte then compiler treats automatically as byte literal, similarly short literal also
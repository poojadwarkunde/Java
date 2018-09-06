package java.practice.examples.literals;

public class JavaPracticeExamplesFloatingLiterals {

	public static void main(String[] args) {
		test();
		test1();
		test2();
		test3();
		test4();
	}

	private static void test4() {
boolean b =true;
//boolean b1 = True;True cannot be resolved to a variable
//boolean b2 = 0;Type mismatch: cannot convert from int to boolean
//boolean b3 = "True"; Type mismatch: cannot convert from String to boolean
	}

	private static void test3() {
		double d = 10;System.out.println(d);
//		int x = 10.0;System.out.println(x); //Type mismatch: cannot convert from double to int
		double d1 = 1.2e3;System.out.println(d1);
	}
//we can't assign floating point literals to integral types

	private static void test2() {
//		double d =0786;System.out.println(d);//The literal 0786 of type int is out of range 
		double d1 = 0xface;System.out.println(d1);
		double d2 = 0786.0;System.out.println(d2);
//		double d3 = 0x786.0;System.out.println(d3);//Invalid hex literal number
		double d4 =10;System.out.println(d4);
		double d5 = 0777;System.out.println(d5);
	}
//	we can assign integral literal to floating point var and that integral literal can be specified in deciaml,octal or hexa form

	private static void test1() {
		double d = 123.456;System.out.println(d);
		double d1 =0123.456;System.out.println(d1);
//		double d2 = 0x123.456;System.out.println(d2);//Invalid hex literal number
	}
// we can specify floating point literals only in decimal , and we can't specify in ocatl and hexadecimal forms
	private static void test() {
//		float f =123.456; //Type mismatch: cannot convert from double to float
		float f1 = 123.456f;System.out.println(f1);
		double d =123.456; System.out.println(d);
		double d1 = 123.496D;System.out.println(d1);
//		float f = 123.456d; //Type mismatch: cannot convert from double to float
	}

}

//by default every floating point literal is of double type and hence we can't assign directly to float var but we can specify floating point literal by suffixing f/F.
//only allowed value for boolean literal are true ,false
//we can specify floating point literal even in exponential form(scientific notation)
//float f = 1.2e3 ;  invalid
//float f = 1.2e3f; valid

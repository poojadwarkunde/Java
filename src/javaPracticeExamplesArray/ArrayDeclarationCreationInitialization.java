package javaPracticeExamplesArray;

public class ArrayDeclarationCreationInitialization {

	public static void main(String[] args) {
		int[] x= {10,20,30};
		char[] ch = {'a','e','i','o','u'};
		String[] s = {"A","AA","AAA"};
//we can declare,create and initialize in simgle line
		
		int[][] x1 = {{10,20},{30,40,50}};
		//we can extend this shortcut for multi dimensional arrays also
		
		int[][][] x2 = {{{10,20,30},{40,50,60}},{{70,80},{90,100,110}}};
		
		System.out.println(x2[0][1][2]); //60
		
		System.out.println(x2[1][0][1]);//80
		
//		System.out.println(x2[2][0][0]);java.lang.ArrayIndexOutOfBoundsException
		
//		System.out.println(x2[1][2][0]);java.lang.ArrayIndexOutOfBoundsException
		
		System.out.println(x2[1][1][1]); //100
		
//		System.out.println(x2[2][1][0]);java.lang.ArrayIndexOutOfBoundsException
		
//		System.out.println(x2[2][1][2]); java.lang.ArrayIndexOutOfBoundsException
		
//		System.out.println(x2[2][2][2]); java.lang.ArrayIndexOutOfBoundsException
		
		test();
		}

	private static void test() {
		int[] x;
//		x = {10,20,30};//Array constants can only be used in initializers
	}
	}



package javaPracticeExamplesArray;

public class JavaPracticeExamples2DArrayCreation {

	public static void main(String[] args) {
//		test();//first way
//		test1();//second way
//		test2();
//		test3();
//		test4();
//		test5();
		test6();
	}

	private static void test6() {
		int[] x = new int[3];
		x[0] =10; x[1] = 20;x[2] = 30;
//		x[3] =40;//java.lang.ArrayIndexOutOfBoundsException
		x[-4] =50;//java.lang.ArrayIndexOutOfBoundsException
//		x[2.5] =60;// Type mismatch: cannot convert from double to int
//		if we are trying to access array element with out of range indwex either + or  value, then we will get runtime exception saying arrayoutofBoundsexception
	}

	private static void test5() {
		int[][] x =new int[2][];
		System.out.println(x);//[[I@52e922
		System.out.println(x[0]);//null
		System.out.println(x[0][0]);//nullpointerexception
//		if we are trying to perform any operation on null then we will get runtime exception saying null pointer exception
		
	}

	private static void test4() {
		int[][] x =new int[2][3];
		System.out.println(x);//[[I@52e922
		System.out.println(x[0]);//[I@25154f
		System.out.println(x[0][0]);//0 
	}

	private static void test3() {
		// TODO Auto-generated method stub
		//Array initialization
		int[] x = new int[3];
		System.out.println(x);//[I@52e922
		System.out.println(x[0]);//0
//		once we creates an array every array element by default initialized by with value 
		double[] x1 = new double[3];
		System.out.println(x1);//[D@25154f
		System.out.println(x1[0]);//0.0
		long[] x2 = new long[3];
		System.out.println(x2);//[J@10dea4e
		System.out.println(x2[0]);//0
		float[] x3 = new float[3];
		System.out.println(x3);//[F@647e05
		System.out.println(x3[0]);//0.0
		byte[] x4 = new byte[3];
		System.out.println(x4);//[B@1909752
		System.out.println(x4[0]);//0
		short[] x5 = new short[3];
		System.out.println(x5);//[S@1f96302
		System.out.println(x5[0]);//0
		char[] x6 = new char[3];
		System.out.println(x6);
		System.out.println(x6[0]);
		//whenever we are trying to print any reference variable internally, 2 string method will be called which is implemented by default to return the string in following form:
		//classname@hashcode in hexadeciaml form
	}

	private static void test2() {
		// TODO Auto-generated method stub which of the following array declarations are valid :
//		int[] a = new int[]; //Variable must provide either dimension expressions or an array initializer
		int[] a1 = new int[3];
//		int[][] a2 = new int[][];//Variable must provide either dimension expressions or an array initializer
		int[][] a3 = new int[3][];
//		int[][] a4 = new int[][4];//Cannot specify an array dimension after an empty dimension
		int[][] a5 = new int[3][4];
		int[][][] a6 = new int[3][4][5];
		int[][][] a7 = new int[3][4][];
//		int[][][] a8 = new int[3][][5];//Cannot specify an array dimension after an empty dimension
//		int[][][] a9 = new int[][4][5];//Cannot specify an array dimension after an empty dimension
		
	}

	private static void test1() {
		int[][][] x =new int[2][][];
		x[0] = new int[3][];
		x[0][0] = new int[1];
		x[0][1] = new int[2];
		x[0][2] = new int[3];
		x[1] = new int[2][2];
		}

	private static void test() {
		int[][] x=new int[2][];
		x[0] = new int[2];
		x[1] = new int[3];		
	}

}
//2-D array creation
//in java 2-D array not implemented using matrix style, some people array of arrays approach for multi-dimensional array creation.
//main advantage of this approach is memory utilization will be improved.





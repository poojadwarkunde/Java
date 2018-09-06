package javaPracticeExamplesArray;

public class JavaPracticeExamplesArrayCreation {

	public static void main(String[] args) {
		int[] a = new int[3];
		System.out.println(a.getClass().getName()); //[I
		int[][] a1 = new int[3][3]; System.out.println(a1.getClass().getName());//[[I
		double[][] dl = new double[3][3]; System.out.println(dl.getClass().getName());//[[D
		short[][] st = new short[3][3]; System.out.println(st.getClass().getName());//[[S
		byte[][] bt = new byte[3][3]; System.out.println(bt.getClass().getName());//[[B
		boolean[][] bn = new boolean[3][3]; System.out.println(bn.getClass().getName());//[[Z
		System.out.println(args.length);//0
		 int[] xx =new int[-3]; System.out.println(xx.length); //no compile time error but will get RUntime error : Negative array size exception
//		 int[] q = new int[2147483648]; //The literal 2147483648 of type int is out of range 
	}

}
//every array in java is object only, hence we can create arrays using new operator
//int[] a = new int[3];
//for every array corresponding classes are available and these classes are part of java lang and not available to programmer level.

//Array Type		Corresponding class Name
//int[] 				[I
//int[][]				[[I
//double[] 				[D
//short[]				[S
//byte[]				[B
//boolean				[Z      				 

//Loopholes in Array:
//	1. at the time of array creation , we need to specify size, otherwise compile time error will be displayed
//		int[] x =new int[]; : Invalid
//		int[] x1 = new int[5]; : valid
//	2. int[] x =new int[0]; : Valid : itis legal to have an array woth size 0 in java
//	3. int[] x =new int[-3]; //: Invalid
//	4. int[] x= new int[10];
//		int[] x = new int['a'];
//		byte b = 20; int[] x = new int[b];
//		short s =30; int[] x = new int[s];
//		to specify arrray size allowed data types are above, if we are trying to specify any other type , then we will get compile time error
//		int[] x = new int[10l]; : Compile time error for this
//	5. max allowed size for array is 2147483647; : even in this case we may get runtime error if suffiecient heap memory not available
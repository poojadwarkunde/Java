package JavaPracticeExamplesDataTypes;

public class JavaDataypesFloatDouble {
	public static void main(String[] args) {
		boolean b = true; System.out.println(b);
//		boolean b1 = 0; System.out.println(b1); //Type mismatch: cannot convert from int to boolean
//		boolean b2 = True; System.out.println(b2); //True cannot be resolved to a variable
//		boolean b3 = "True"; System.out.println(b3); //Type mismatch: cannot convert from String to boolean
		int x =0;
//		if(x) {System.out.println("hello"); } //Type mismatch: cannot convert from int to boolean
//		else {System.out.println("hi"); }
//		
//		while(1) {System.out.println("hello");} //Type mismatch: cannot convert from int to boolean
	}
}

//Floating point data types:
//1. float
//	* if we want 5 to 6 decimal points
//	* Single precision
//	* 4 bytes
//	* -3.4e38 to 3.4e38
//2. double
//	* if we want 14 to 15 decimal points
//	* double precision
//	* size : 8 bytes
//	* range : -1.7e38 to 1.e38
//3. boolean
//	* size = not applicable [vm dependent]
//	* range : NA
//	* Allowed values : true and false
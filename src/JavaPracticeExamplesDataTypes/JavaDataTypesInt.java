package JavaPracticeExamplesDataTypes;

public class JavaDataTypesInt {

	public static void main(String[] args) {
 int x = 2147483647; System.out.println(x);
// int x1 = 2147483648; System.out.println(x1); //The literal 2147483648 of type int is out of range
// int x2 = 2147483648L; System.out.println(x2); //Type mismatch: cannot convert from long to int
// int x3 = true; System.out.println(x3); //Type mismatch: cannot convert from boolean to int
	}

}

//int:
//	1. most commonly used data type in java is int
//	2. size :4 bytes : 32 bits
//	3. range : -2147483648 to 2147483647

//Long:
//	1. sometoimes int may not be enough to hold big values, then we should go for long type
//	2. ex : amount of distance travelled by light in 10 days
//	long l = 126000*60*60*24*1000
//	3. to hold number of characters in file int may not be enough hence use long
//	4. size : b bytes : 64 bits
//	5. range : -2^63 to 2^63
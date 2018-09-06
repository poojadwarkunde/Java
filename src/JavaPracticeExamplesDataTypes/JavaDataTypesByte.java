package JavaPracticeExamplesDataTypes;

public class JavaDataTypesByte {

	public static void main(String[] args) {
		byte b= 127;
		System.out.println(b);
		System.out.println();
		byte b1= 10;
		System.out.println(b1);
		System.out.println();
//		byte b2= 128; //Type mismatch: cannot convert from int to byte
//		System.out.println(b2);
//		System.out.println();
//		byte b3= 10.5; //Type mismatch: cannot convert from double to byte
//		System.out.println(b3);
//		System.out.println();
//		byte b4= true; //Type mismatch: cannot convert from boolean to byte
//		System.out.println(b4);
//		System.out.println();
//		byte b5= "pooja"; //Type mismatch: cannot convert from String to byte
//		System.out.println(b5);
//		System.out.println();
		}

}

/*
 * In java every variables and expressions has some type, each and every data type is clearly defined, every assignment should be chekced by compiler for type compatibility, because of this we can conclude Java is strongly typed language
 * Java is not considered as pure OOP language because several OOPS features are not satisfied by JAVA, like operator overloading and multiple inheritance
 * Moreover we are depending on primitive data types which are non objects 
 * 
 * Primitive Data types:
 * (Signed data types coz we can represnt both +ve and -ve number )Numeric Data Types: 
 * 					1. Integral : Byte,short,int,long
 * 					2. Floating types : float,double
 * Non-Numeric Data Types : char, boolean
 * 
 * 1. byte :
 * - 1 byte = 8 bits
 * - range : -128 to 127 
 * -   byte b =10; V
 * - b=127;V
 * - b=128 : Possible loss of precision, found int required byte
 * - b =10.5 : PLP, found double, required byte
 * - b = true : incompatible types found /: boolean, required : byte
 * - b = "pooja"
 * 
 *  1. byte is a best choice if you want to handle data in term of streams either from file or network.
 *  2. File/Network supported form is byte
 * 
 * 
*/

package JavaPracticeExamplesDataTypes;

public class JavaIdentifiers {

	public static void main(String[] args) {
		int x = 10;
//		int if =20; // Syntax Error
		int String = 888;
		int Runnable = 999;
		System.out.println(x);
		System.out.println(String);
		System.out.println(Runnable);
		/*
		 * Identifiers in above program CLass name: JavaIdentifiers,method name : main
		 * ,pre-defined java class name : String, name of array: args, name of variable
		 * : x
		 */
	}

}

/*
 * Java Identifiers are case sensitive Name in java program is called
 * identifier, which can be used for identification purpose. It can method
 * name,variable name , class name or label name Rules and regulation while
 * defining java Identifiers 1. allowed char in java idnetifiers are a-z, A-z, 0
 * to 9, $,_ 2. For any other symbol we will get CE(Compile time error?) 3.
 * Idnetifiers can't start with digits : total213 = V but 123totoal = Invalid 4.
 * Java idnetifiers are case sensitive of course java is considered as case
 * sensitive prog lang. number 10 ; Number = 10; NUMBER = 10; are diff
 * identifiers 5. Max characters allowed are : No length limit 6. Reserved words
 * can not be used as identifiers : int x =10; int if =20; 7. All JAVa
 * pre-defined class name and interaface name we can use as identifiers : int
 * String =888; int Runnable =999 even though it is valid but not a good
 * programming practice, because it reduces readability and creates condusion
 * 
 * Question ; total_number : V total# : I 123total : V total123 : V ca$h : V
 * _$_$_$_$ : V all@hands : I Java2share : V Integer : V Int : V int : I
 */

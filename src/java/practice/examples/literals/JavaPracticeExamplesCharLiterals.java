package java.practice.examples.literals;

public class JavaPracticeExamplesCharLiterals {

	public static void main(String[] args) {
		char c = 'a'; System.out.println(c);
//		char c1 = a; System.out.println(c1);//a cannot be resolved to a variable
//		char c2 = "a";System.out.println(c2);//Type mismatch: cannot convert from String to char
//		char c3 ='ab'; System.out.println(c3);//Invalid character constant
		test();
		test1();
		test2();
//		test3();
	}

	private static void test2() {
			System.out.println( "This is \' character");
			System.out.println( "This is \" character");
			System.out.println( "This is \\ character");
//			System.out.println( "This is \? character");//Invalid escape sequence (valid ones are  \b  \t  \n  \f  \r  \"  \'  \\ )
	}

	private static void test1() {
//we can represent char in unicode representation, which is nothing but \u0000
		char ch3 = '\u0061';System.out.println(ch3); // invalid unicode
		char ch = '\n';System.out.println(ch);
		char ch1 = '\t';System.out.println(ch1);
//		char ch2 = '\m';System.out.println(ch2); //Invalid escape sequence (valid ones are  \b  \t  \n  \f  \r  \"  \'  \\ )
//		every escape character is valid char literal		
	}

	private static void test() {
		//we can specify char literal as integral loteral which represent unicode value of character and that integral literal can be spcified in decimal,octal or hexadecimal forms but allowed range is 0 to 65535
		char c = 97; System.out.println(c);
		char c1 = 0xface;System.out.println(c1);//?
		char c2= 0777;System.out.println(c2);//?
		char c3 = 65535;System.out.println(c3); //?
//		char c4 = 65536 ;System.out.println(c4);//Type mismatch: cannot convert from int to char
	}

}

//we can specify char literal single character within single quotes
//char ch ='a';

//\n  new line
//\t  horizontal tab
//\r  carriage return
//\b backspace
//\f  form feed
//\'  single quote
//\"  double quote"
//\\  backslash


//which are the following are valid : except beef everyhting else in invalid
//	
//char ch = 65536;
//char ch = 0xbeer;
//char ch = \uface;
//char ch = '\ubeef';
//char ch ='\m';
//char ch = '\iface';
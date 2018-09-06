package java.practice.examples.literals;

public class JavaPracticeExamplesStringLiterals {

	public static void main(String[] args) {
			String s = "Pooja"; System.out.println(s);
	}

}

//any sequence of cahracter within "" is treated as String literal

//1.7 enhancements w.r.t literals :
//	1. Binary Literals : int x = 0b111; or int x = 
//	for integral data types until 1.6 v we can specify literal value in decimal,octal,hexadecimal form.
//	but 1.7 v onwards , we can specify literal value even in binary form also, allowed digits are 0,1.
//	literal value should prefixed with 0b or 0B
//	2. double d = 123456.789; => double d = 1_23_456.7_8_9; or double d= 133_456.7_8_9;
//			usage of underscore symbol in numeric literals, from 1.7 v onwards we can use _ symbol between digits of numeric literal
//			main advantage of this approach is readability of code will be improved
//			at the time of compilation , these _ symbols will be removed automatically, hence after compilation above lines will beacome : double d = 123456.789;
//			double d = 1__23_4_5__6.7_8_9 : we can use more than one _ symbol also between digits
//			double d = _1_23_456.7_8_9;
//			double d = 1_23_456_.7_8_9;
//			double d = 1_23_456.7_8_9_;
//			we can _ symbol only between digits, if we are using anywhere else, we will get compile time error, hence all above are invalid
//1b		2b		4b
//Byte > short > int		8b		4b		8b
//					> long > float > double
//char > int
//
//8 byte long value we can assign to 4b float variable because both follows diff memory represntation interanally


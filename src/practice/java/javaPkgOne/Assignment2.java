package practice.java.javaPkgOne;

public class Assignment2 {

	public static void main(String[] args) {
		assignment2_1();
		assignment2_2();
		assignment2_3();
		assignment2_4();
		assignment2_5();

	}
	// solution of below statement
	private static void assignment2_5() {
		System.out.println();
		int a = 10;
		int ans = a++ + --a - --a + ++a;
		System.out.println("Value of A  : " + ans);	
	}
	// Print Car Price
private static void assignment2_4() {
	System.out.println();
		int price =100;;
		String type = null;
		if (price >90) {
			type = "Premium";
		}else if (price >75) {
			type ="platinum";
		}else if (price > 45) {
			type = "Gold";
		}else if (price < 25){
			type ="Classic";
		}
		System.out.println("Type = " + type);
	}
//Print table
private static void assignment2_3() {
	System.out.println();
		System.out.println( " Distance\t\t\t\t" + "Cost" );
		System.out.println("O through 100  \t\t\t\t" + "5");
		System.out.println("More than 100 but not more than 500  " + "\t8");
		System.out.println("More than 500 but less than 1000  " + "\t10");
		System.out.println("1000 or more  \t\t\t\t" + "12");
	}
//Average of one integer and another double value
private static void assignment2_2() {
	System.out.println();
		int num1 =10;
		double num2 = 7;
		double ans ;
		System.out.println("Average of 2 Nos : " + ((num1+num2)/2));
		
	}
// Declare 2 strings varibale and concatenate and print
	private static void assignment2_1() {
		System.out.println();
		String s1 = "Pooja";
		String s2 = "Dwarkunde";
				System.out.println(s1 + " " + s2);
	}

}

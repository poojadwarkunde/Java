package practice.java;

public class StringExamples {

	public static void main(String[] args) {
		// String str = " I am Pooja Dwarkunde ";
		// System.out.println(str);
		// removeSpaces(" I am Pooja Dwarkunde ");
		// reverse(" I am Pooja Dwarkunde ");
		// oddCharacters(" I am Pooja Dwarkunde ");
		// upperlower(" I am Pooja Dwarkunde ");
		// occurrence(" I am Pooja Dwarkunde ");
		// strequals();
//		triangle();
//		ultatriangle();
//		righttriangle();
//		damaroo();
		notriangle();
	}

	private static void notriangle() {
		for(int i=1;i<=3;i++) {
			for(int j=3-i;j>=0;j--) {
				System.out.print(" ");
			}
			for(int k=1 ;k<=i;k++) {
				System.out.print(k +" ");
			}
		System.out.println();
		}
	}

	private static void damaroo() {
//		triangle();
		ultatriangle();
		triangle();
	}

	private static void righttriangle() {
		for(int i=0;i<=3;i++) {
			for(int j=3-i;j>=0;j--) {
				System.out.print(" ");
			}
			for(int k=0 ;k<=i;k++) {
				System.out.print("*");
			}
		System.out.println();
		}
	}

	private static void ultatriangle() {
		for (int i = 3; i >= 0; i--) {
			for (int k = 3 - i; k >= 0; k--) {
				System.out.print(" ");
			}
			for (int j = i; j >= 0; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	private static void triangle() {
		for (int i = 0; i <= 3; i++) {
			for (int k = 3 - i; k >= 0; k--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	private static void strequals() {
		String a = "Sagar";
		String b = new String("Sagar");
		System.out.println(a == b);
		System.out.println(a.equals(b));
		System.out.println(a == b.intern());
	}

	private static void occurrence(String string) {
		char[] newchararray = string.toCharArray();
		int count = 0;
		for (int i = 0; i < newchararray.length; i++) {
			for (int j = 1; j < newchararray.length; j++)
				if (newchararray[i] == newchararray[j]) {
					count++;
				}
			System.out.println(newchararray[i] + "  " + count);
		}
	}

	private static void upperlower(String string) {
		String stru = string.toUpperCase();
		System.out.println(stru);
		String strl = string.toLowerCase();
		System.out.println(strl);
	}

	private static void oddCharacters(String string) {
		String newstring = string.trim();
		System.out.println(newstring);
		// int length = newstring.length();
		char[] c = newstring.toCharArray();
		for (int i = 0; i <= c.length; i++) {
			if (i % 2 != 0) {
				System.out.print(c[i]);
			}
		}
	}

	private static void reverse(String string) {
		String newstring = removeSpaces(string);
		// System.out.println(newstring);
		char[] c = newstring.toCharArray();
		for (int i = 0; i < c.length / 2; i++) {
			char z;
			z = c[i];
			c[i] = c[c.length - 1 - i];
			c[c.length - 1 - i] = z;
		}
		System.out.print(c);
		System.out.println();
	}

	private static String removeSpaces(String string) {
		String s = string;
		System.out.println(s);
		System.out.println(s.trim());
		String a = s.replace(" ", "");
		System.out.println(a);
		return a;
	}

}

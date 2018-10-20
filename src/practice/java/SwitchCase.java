package practice.java;

public class SwitchCase {

	public static void main(String[] args) {
		// Switch Syntax
		// int long double : Pre-defined reserved keyword in java
		String s = "IE"; // we treat String class as data type
		switch (s) {
		case "IE":
			// Statement
			System.out.println("Internet Explorer");
			break;
		case "Chrome":
			System.out.println("Chrome");
			break;
		case "Firefox":
			System.out.println("Firefox");
			break;
		default:
			System.out.println("Default");
			break;
		}
	}

}

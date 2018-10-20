package practice.java;

public class StringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] sarr = new String[5]; 
		sarr[0] = "Sachin";
		sarr[2] = "Mandar";
		sarr[4] = "ABC";
		
		System.out.println("String Array : ");
		for (int i = 0; i < sarr.length; i++) {
			System.out.println(sarr[i]);
		}
		
		char[] carr  = new char[5];
		carr[0] = 'A';
		carr[2] = 'B';
		carr[4] = 'C';
		System.out.println("Char Array : ");
		for (int i = 0; i < carr.length; i++) {
			System.out.println(carr[i]);
		}
		
		long[] larr  = new long[5];
		larr[0] = 2;
		larr[2] = 4;
		larr[4] = 6;
		System.out.println("long  Array : ");
		for (int i = 0; i < larr.length; i++) {
			System.out.println(larr[i]);
		}
	}

}

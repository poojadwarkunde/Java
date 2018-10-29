package practice.java.numericexamples;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println("Enter Number :");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		boolean flag = true;
		for(int i=2;i<num/2;i++) {
			if(num%i==0) {
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println("No is Prime");
		}else {
			System.out.println("No is not Prime");
		}
	}

}

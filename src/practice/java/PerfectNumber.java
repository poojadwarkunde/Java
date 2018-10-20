package practice.java;

public class PerfectNumber {

	public static void main(String[] args) {
		if(perfectNo(9)) {
			System.out.println("Number is perfect");
		}
		else {
			System.out.println("No is not prefect");
		}
	}

	public static boolean perfectNo(int givenNumber) {
		int temp =0;
		for (int i = 1; i <= givenNumber/2; i++) {
			if (givenNumber % i == 0) {
				temp = temp + i;
			}
		}
//		if (temp == givenNumber) {
//			return true;
//		}
//		return false;
		return (temp == givenNumber? true : false);
//		return(temp == givenNumber);
	}
}

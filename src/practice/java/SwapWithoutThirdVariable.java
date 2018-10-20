package practice.java;

public class SwapWithoutThirdVariable {

	public static void main(String[] args) {
//		swap(10,20);
//		greatestOfNumber(20,30,30);
//		arrayTwoGreatestNumber();
//		reverseNumber(45780);
//		palindrome(12321);
		armstrongNumber(371);
	}

	private static void armstrongNumber(int n) {
		int temp =n;
		int a=0;int arm=0;
			while(n!=0) {
				a=n%10;
				arm =arm+(a*a*a);
				n=n/10;
			}
			System.out.println(" n is : " + temp + " arm is " +arm);
			if(temp == arm) {
				System.out.println("Given no is armstrong no");
			}else {
				System.out.println("Given no is not armstong no");
			}
	}

	private static void palindrome(int i) {
		if(i == reverseNumber(i)) {
			System.out.println("Number is palindrome");
		}else 
		{
			System.out.println("Number is not palindrome");
		}
	}

	private static int reverseNumber(int i) {
		int r=0;
		while(i!=0) {
			r=(i%10)+10*r;
			i=i/10;
		}
		System.out.println(r);
		return r;
	}

	private static void arrayTwoGreatestNumber() {
		int[] arr = {40,5,20,3,6,9};int temp=0;
		for (int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					temp = arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		System.out.println("Largest 2 numbers in Array are " + arr[0] +" and " + arr[1]);
	}

	private static void greatestOfNumber(int i, int j, int k) {
		if(i>j & i>k) {
			System.out.println(i + "i is greatest number");
		}
		else if(j>k) {
			System.out.println(j + " j is greatest number");
		}
		else {
			System.out.println(k + " k is greatest number");
		}
	}

	private static void swap(int a, int b) {
		System.out.println(" a =" + a + " b =" + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println(" a =" + a + " b =" + b);
	}

}

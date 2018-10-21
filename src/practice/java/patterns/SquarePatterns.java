package practice.java.patterns;

public class SquarePatterns {

	public static void main(String[] args) {
//		pat1();
//		pat2();
//		pat3();
//		pat4();
//		pat5();
		pat6();
		pat7();
		pat8();
		pat9();
	}

	private static void pat9() {
		System.out.println("############################## Pattern 9 ##############################");
		for (char i='E';i>='A';i--) {
			for(char j='E';j>='A';j--) {
				System.out.print(" "+ j +" ");
			}
			System.out.println();
		}			
	}

	private static void pat8() {
		System.out.println("############################## Pattern 8 ##############################");
		for (char i='E';i>='A';i--) {
			for(char j='E';j>='A';j--) {
				System.out.print(" "+ i +" ");
			}
			System.out.println();
		}		
	}

	private static void pat7() {
		System.out.println("############################## Pattern 7 ##############################");
		for (int i=5;i>=1;i--) {
			for(int j=5;j>=1;j--) {
				System.out.print(" "+j+" ");
			}
			System.out.println();
		}			
	}

	private static void pat6() {
		System.out.println("############################## Pattern 6 ##############################");
		for (int i=5;i>=1;i--) {
			for(int j=5;j>=1;j--) {
				System.out.print(" "+i+" ");
			}
			System.out.println();
		}	
	}

	private static void pat5() {
		System.out.println("############################## Pattern 5 ##############################");
		for (char i='A';i<='E';i++) {
			for(char j='A';j<='E';j++) {
				System.out.print(" "+ j +" ");
			}
			System.out.println();
		}			
	}

	private static void pat4() {
		System.out.println("############################## Pattern 4 ##############################");
		for (char i='A';i<='E';i++) {
			for(char j='A';j<='E';j++) {
				System.out.print(" "+ i +" ");
			}
			System.out.println();
		}			
	}

	private static void pat3() {
		System.out.println("############################## Pattern 3 ##############################");
		for (int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(" "+j+" ");
			}
			System.out.println();
		}		
	}

	private static void pat2() {
		System.out.println("############################## Pattern 2: ##############################");
		for (int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(" "+i+" ");
			}
			System.out.println();
		}			
	}

	private static void pat1() {
		System.out.println("############################## Pattern 1: ##############################");
		for (int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}		
	}

}

package practice.java.javaPkgOne;

public class ForLoop {

	public static void main(String[] args){
		pyramid(5,"#");
	}

	private static void pyramid(int size, String str) {
		for (int i=1;i<=size;i++) {
			for(int j=1; j<=i;j++) {
				System.out.print(str!=null ? str : j);
			}
			System.out.println();
		}
	
		// For Loop syntax
		// int i;
		//for(initialization;condition;increment/decrement)
		//for(i=10;i>=0;i-=2)
		//{
		//	System.out.println(i);
		//}
		
		/* 1 2 3
		 * 1 2
		 * 1
		 */
		
		for (int i = 3 ; i>=1; i--)
		{
			for (int j= 1; j <= i ; j++)
			System.out.print(j + "\t " );
		//for (int j = 3; j >= i;j-- )
			//System.out.print(j);
			System.out.println("\n");
		}
		
	
	/* A B C
	 * A B
	 * A
	 */
		for (char i='A'; i<='C' ; i++)
		{
			for (char j='A'; j<=i;j++)
				System.out.print(j+"\t");
			System.out.println("\n");
		}
		
	}
}

		/* Code to print 
		 * 1
		 * 1 2
		 * 1 2 3
*/

		
		/* Code to print 
		 * 1 2 3
		 * 1 2
		 * 1 

		for (int i= 3;i>=1;i++) {
			for (int j=1; j<=3; j++) {
				System.out.println(j);
		}
		System.out.println(i);
	} */
		//		int b = 10;
		//		--b  + b++  -  --b  + b++;
		//		System.out.println(b);

package practice.java.exceptions;

public class UncheckedException {

	public static void main(String[] args) {
		try { // code in this block is protected code
			int num[] = { 1, 2, 3, 4 };
			System.out.println(num[5]);
		} catch (ArrayIndexOutOfBoundsException | ArithmeticException e) { // code in this block is
														// implemented code
			// TODO Auto-generated catch block
			e.printStackTrace();
			// throw e;
			// System.out.println("Program terminated");
		} catch (Exception e) {
			System.out.println("this is a way to handle");
		}finally {
			System.out.println("Execute");
		}
	}

}

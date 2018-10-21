package practice.java.oopsconcept;

import practice.java.exceptions.MyParentException;

public class ExceptionExample {

	public static void main(String[] args) {
		System.out.println(method0());
	}

	public static int method0() {
		boolean myFlag = true;
		try {
			method1(myFlag);
			System.out.println("try");
			// return 1;
		} catch (MyParentException e) {
			System.out.println("catch");
			// return 2;
		} finally {
			System.out.println("Finally");
		}
		 return 3;
	}

	public static void method1(boolean flag) throws MyParentException {
		if (flag) {
			throw new MyParentException();
		}
	}

}

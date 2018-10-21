package practice.java.exceptions;

public class MyChildException extends MyParentException {

	public MyChildException() {
		// TODO Auto-generated constructor stub
	}

	public MyChildException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public MyChildException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public MyChildException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public MyChildException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	public static void m1(String s) {
		System.out.println("string");
	}
	public static void m1(Integer i) {
		System.out.println("integer");
	}
	public static void main(String[] args) {
		Integer s1 = null;
		m1(s1);
	}
}

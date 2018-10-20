package practice.java;

public class MyParentException extends Exception {

	public MyParentException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MyParentException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public MyParentException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public MyParentException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public MyParentException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public int m1() {
		System.out.println("m1 method in parent");
		return 0;
	}
	public float m1(int x) {
		System.out.println("m1 method in parent");
		return 0f;
	}
}

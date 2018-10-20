package practice.java.constructorr;

public class DefaultConstructor {
	/*
	 * This COnstructor is used to print only hello
	 * 
	 * @Param : None
	 * 
	 * @Return : None
	 */
	public DefaultConstructor() {
		// when public is removed from above line then that constructor will be
		// default
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		DefaultConstructor inst = new DefaultConstructor();

	}

}

package practice.java.oopsconcept;

public class EncapsulateClass {
	private String browser = "Chrome";

	// Create new getter
	public String getBrowser() {
		return browser;
	}
}

class AccessPrivate {
	public static void main(String[] args) {
		EncapsulateClass e = new EncapsulateClass();
		e.getBrowser();
	}
}

package practice.java;


//import SpecifiersPkg.PublicClass;

/*public class AccessClass {

	public static void main(String[] args) {
 //PublicClass p = new PublicClass();
  p.add();
	}

}*/

public class AccessClass extends PublicClass {
	public static void main(String[] args) {
		AccessClass p = new AccessClass();
		p.add();
	}
}

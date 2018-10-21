package practice.java.collections;

import java.util.HashMap;
import java.util.Map;

public class HashCodeEquals {
	
	public String name;

	public static void main(String[] args) {
		Student s1 = new Student(1, 100);
		Student s2 = s1;
		Student s3 = new Student(1, 100);
//		System.out.println("==");
//		System.out.println(s1 == s2); //T
//		System.out.println(s2 == s3); //F
//		System.out.println(s3 == s1); //F
//		
//		System.out.println("equals");
//		System.out.println(s1.equals(s2)); //T
//		System.out.println(s2.equals(s3)); //F
//		System.out.println(s3.equals(s1)); //F
		
		Map<Student, String> map = new HashMap<>();
		map.put(new Student(1,100), "Sagar");
		map.put(new Student(2,200), "Pooja");
		
		System.out.println(map.get(new Student(1,100)));
		System.out.println(map.size());
	}
}

class Student {
	private int id;
	private int sal;

	public Student(int id, int sal) {
		super();
		this.id = id;
		this.sal = sal;
	}
	
	@Override
	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + sal;
//		return result;
		return 0;
	}

	@Override
	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Student other = (Student) obj;
//		if (sal != other.sal)
			return false;
//		return true;
	}

	@Override
	public String toString() {
		return "{ id n Sal = " + id + ", " + sal + "}";
	}
}
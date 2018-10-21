package practice.java.numericexamples;

import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {
		Random r = new Random();
		r.ints(0, 100).forEach(System.out:: println);
		System.out.println(r.nextInt(100));
		long tm = System.currentTimeMillis();
		System.out.println(tm%100);
	}

}

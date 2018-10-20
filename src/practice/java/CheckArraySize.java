package practice.java;

import java.util.ArrayList;
import java.util.List;

public class CheckArraySize {

	public static void main(String[] args) {
		int oldCapacity = 25;
		int newCapacity = oldCapacity + (oldCapacity >> 1);
		System.out.println(newCapacity);
	}

}

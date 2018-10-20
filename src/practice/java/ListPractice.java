package practice.java;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {

	public static void smain(String[] args) {
		// Collection
		// 1. List
		
		List<String> list = new ArrayList<>();
		list.add("Sagar");
		list.add("Pooja");
		list.add("Borse");
		System.out.println(list);
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		for( String str: list) {
			System.out.println(str);
		}
	}

}

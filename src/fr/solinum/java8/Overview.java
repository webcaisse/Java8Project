package fr.solinum.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Overview {

	public static void main(String[] args) {

		List<String> names1 = new ArrayList<String>();
		names1.add("Mahesh ");
		names1.add("Suresh ");
		names1.add("Ramesh ");
		names1.add("Naresh ");
		names1.add("Kalpesh ");

		List<String> names2 = new ArrayList<String>();
		names2.add("Mahesh ");
		names2.add("Suresh ");
		names2.add("Ramesh ");
		names2.add("Naresh ");
		names2.add("Kalpesh ");

		// sorting with java 7

		System.out.println("Before sorting with java 7");
		System.out.println(names1);
		System.out.println("After sorting with java 7");
		names1.sort(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});

		System.out.println(names1);

		// sorting with java 8

		System.out.println("Before sorting with java 8");
		System.out.println(names2);

		Collections.sort(names2, (o1,o2)->o1.compareTo(o2));
		System.out.println("After sorting with java 8");
		System.out.println(names2);

	}

}

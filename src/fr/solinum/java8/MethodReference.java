package fr.solinum.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MethodReference {

	public static void main(String[] args) {

		List<String> names = new ArrayList<String>();

		names.add("Mahesh");
		names.add("Suresh");
		names.add("Ramesh");
		names.add("Naresh");
		names.add("Kalpesh");
		
		//names.forEach(System.out::println);;
		
		
		System.out.println(names.stream().filter(name->name.startsWith("Ma")).collect(Collectors.toList()));
		
	}
}

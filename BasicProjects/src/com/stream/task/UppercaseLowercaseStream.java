package com.stream.task;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UppercaseLowercaseStream {

	public static void main(String[] args) {

		List<String> name = Arrays.asList("kalai", "madhav", "kalai", "deep", "kavi");

//		List<String> upperCase = name.stream()
//				.filter(UppercaseLowercaseStream :: startsWithk)
//				.distinct()
//				.sorted()
//				.map(String::toUpperCase)
//				.collect(Collectors.toList());
//		System.out.println(upperCase);

		List<String> lowerCase = name.stream().distinct()
				.filter(n->n.endsWith("i"))
				.sorted()
				.map(String::toLowerCase)
				.collect(Collectors.toList());
		System.out.println(lowerCase);
		
	}
	
//	private static boolean startsWithk(String name) {
//        return name.startsWith("m");
//	}
}
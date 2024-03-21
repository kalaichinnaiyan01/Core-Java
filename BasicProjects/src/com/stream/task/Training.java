package com.stream.task;

import java.util.Arrays; 
import java.util.List;
import java.util.stream.Collectors;

public class Training {

	public static void main(String[] args) {
		
		int[] intArray = new int[] {1,2,3,4,5};
		
		
		List<Integer> listArray =Arrays.stream(intArray)
		.sorted()
		.boxed()
		.collect(Collectors.toList())
		;
		 listArray.forEach(System.out::println);
			}
}
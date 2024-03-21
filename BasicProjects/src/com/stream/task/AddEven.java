package com.stream.task;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AddEven {

	public static void main(String[] args) {
		
		List<Integer> intNumbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		List<Integer> even =intNumbers.stream()
		  .filter(n -> n%2==0)
		.collect(Collectors.toList())
		
//		.mapToInt(Integer :: intValue)
//		.sum()
		;
        System.out.println(even);
			}
}
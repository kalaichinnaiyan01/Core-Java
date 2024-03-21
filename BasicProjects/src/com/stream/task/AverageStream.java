package com.stream.task;

import java.util.Arrays;
import java.util.List;

public class AverageStream {

	public static void main(String[] args) {
		
	List<Integer> listInteger = Arrays.asList(89,53,67,100,93);
	
			double average = listInteger.stream()
			.mapToDouble(Integer :: doubleValue)//method reference or double dot operator
			.average()
 	.orElse(0)
			;
	System.out.println(average);
	}

}

package com.kalai.tasks;

import java.util.Arrays;

public class SortArray {

	  
	public static void main(String[] args) {
		int[] statues = { 6, 1, 4, 8 };
		int additionalStatues = findAdditionalStatues(statues);
		System.out.println("The minimum number of additional statues needed is: " + additionalStatues);
	}

	public static int findAdditionalStatues(int[] statues) {
		Arrays.sort(statues);
		int additionalStatues = 0;

		for (int i = 0; i < statues.length - 1; i++) {
			int gap = statues[i + 1] - statues[i] - 1;
			additionalStatues += gap;
		}
 
		
		return additionalStatues;
	}
}



 package com.kalai.tasks;

import java.util.Scanner;

public class AreaOfRectangle {
	
	float length ;
	float width;
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	float length=sc.nextFloat();
	float width=sc.nextFloat();
	 
	double area = length*width;
		
		System.out.println(area);
		
		sc.close();
	}

}

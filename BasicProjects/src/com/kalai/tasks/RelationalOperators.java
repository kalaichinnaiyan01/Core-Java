package com.kalai.tasks;

import java.util.Scanner;

public class RelationalOperators {

	public static void main(String[] args) {
		Scanner scObj = new Scanner(System.in);
		int a =scObj.nextInt();
		int b =scObj.nextInt();
		int c,d,e,f;
		
		c=a+b;
		d=a-b;
		e=a*b;
		f=a/b;
		
//		System.out.println(c + " " + d + " "+ e+" "+ f);
		
		System.out.println(a + b + a++ + b++ + ++a + ++b);
	}
	
	

	

}
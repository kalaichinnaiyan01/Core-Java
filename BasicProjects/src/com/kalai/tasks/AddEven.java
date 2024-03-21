package com.kalai.tasks;

import java.util.Scanner;

public class AddEven {
	static int i;
	static int j;
	public static void main(String[] args) {
		
//		Method 1
//		System.out.println("Even   Odd" ); 
//		for (i = 0; i <= 10; i++) {
//			if(i%2==0) {
//				System.out.print(i+"       "); 
//			}
//			else if(i%2!=0) {
//				System.out.println(i);
//		
//		 for(i=1;i<=10;i++) {
//			 if(i%2!=0) {
//				 System.out.println( i);
				 
				 Scanner scObj = new Scanner(System.in);
				 System.out.println("Enter a number");
				 int number = scObj.nextInt();
			for (i=1;i<=1;i++) {
				if(isEven(number)){
					System.out.println(number+"even");
				}else {
					System.out.println(number+"not even");
				}
		 }
	}
	private static boolean isEven(int number) {
		// TODO Auto-generated method stub
		return number%2==0;
	}
}

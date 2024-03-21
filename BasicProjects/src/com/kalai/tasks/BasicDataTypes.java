package com.kalai.tasks;

import java.util.Scanner;

public class BasicDataTypes {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("what is your name:");
		String name = sc.nextLine();
		
		System.out.println("your  age:");
		int age = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("your Email:");
		String eMail = sc.nextLine();
		
		System.out.println("heyyy " + name);
		System.out.println("your age "+ age);
		System.out.println("your Emails "+ eMail);  
		
		
	}

}

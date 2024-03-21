package com.kalai.tasks;

import java.util.Scanner;

public class JavaStdinandStdout {

	    public static void main(String[] args) {
	    	 Scanner scan = new Scanner(System.in);
	         int j = scan.nextInt();
//	         double d = scan.nextDouble();
//	         System.out.println("dfdfd:");
//	         scan.nextLine(); // Consume the newline character left after reading the double value
	         String s = scan.nextLine(); // Read the entire line
//	         int i = scan.nextInt();
	        
	         System.out.println(j);
//	         System.out.println(d);
             System.out.println(s);
	         
	         scan.close(); // Don't forget to close the scanner when done.
	     }
	}
	


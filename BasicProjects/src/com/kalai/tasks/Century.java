package com.kalai.tasks;

import java.util.Scanner;

public class Century {

	 static int solution(int year) {
//	    return (year%100==0) ?year/100 : year/100+1;
	    if(year%100==0) {
		return year/100;
	    }else {
	    	return year/100+1;
	    }
	 }
	
	  public static void main(String[] args) {
		  Scanner sc =new Scanner(System.in);
		  System.out.print("Enter the Year:");
		  int year = sc.nextInt();
//	        int year = 1905;
	        int century = solution(year);
	        System.out.println("The year " + year + " is in the " + century + "th century.");
	  }


	}
	



package com.kalai.tasks;

public class ReverseString {

	     public static void main(String[] args) {
			String word ="kalai";
			String word2 =" ";
			int i;
			for(i=word.length()-1;i>=0;i--) {
				word2 += word.charAt(i);
			}
			System.out.println(word2);
			if(word.equals(word2))
				System.out.print("It is panlindrome");
			else
				System.out.print("It is not a Palindrome");
		}
	}
	



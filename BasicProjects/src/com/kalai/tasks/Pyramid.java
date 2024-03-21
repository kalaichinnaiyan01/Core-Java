package com.kalai.tasks;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {

		int i;
		int j;
		int m;
		int k;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a row value: ");
		int row = sc.nextInt();

		for (i = 1; i <= row; i++) {

			for (j = 1; j <= row - i; j++) {
				System.out.print(" ");
			}
			for (j = 1; j <= i; j++) {
				System.out.print("7 ");
			}
			System.out.println();
		}

//		Scanner scObj = new Scanner(System.in);
//		System.out.print("Enter a 2nd row value:");
//		int row1 = scObj.nextInt();
//
//		for (m = 1; m <= row1; m++) {
//			for (k = 1; k <= row1 - m; k++)
//				System.out.print(" ");
//		}
//		for (k = 1; k <= m; k++) {
//			System.out.print("* ");
//		}
//		System.out.println( );
	}
}

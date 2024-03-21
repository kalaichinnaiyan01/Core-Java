package com.kalai.tasks;

public class AdjacentElement {

//	    public static int solution(int[] arr) {
//	        int maxProduct = Integer.MIN_VALUE;
//
//	        for (int i = 2; i < arr.length - 1; i++) { 
//	            int product = arr[i] * arr[i + 1];
//	            maxProduct = Math.max(maxProduct, product);
//	        }
//
//	        return maxProduct;
//	    }
//
//	    public static void main(String[] args) {
//	        int[] inputArray = {5, 6, 8, 7, 4};
//	        int result = solution(inputArray);
//	        System.out.println("The largest product of adjace nt elements is: " + result);
//	    }
	        public static void main(String[] args) {
	            int[] inputArray = {3, 6, 2, 5, 7, 3};
	            int maxProduct = findMaxProduct(inputArray);
	            System.out.println(maxProduct); // Output: 21
	        }

	        public static int findMaxProduct(int[] arr) {
	            int maxProduct = Integer.MIN_VALUE;

	            for (int i = 0; i < arr.length - 1; i++) {
	                int product = arr[i] * arr[i + 1];
	                if (product > maxProduct) {
	                    maxProduct = product;
	                }
	            }

	            return maxProduct;
	        }
	    }


	



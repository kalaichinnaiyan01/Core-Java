package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {

//	Array - Fixed size
		short arr[] = new short[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 2;
		arr[3] = 2;
		arr[4] = 2;
//	arr[5]=2;
		System.out.println(Arrays.toString(arr));

//		Arralist - flexible, Supports redudancy
//		Generic Programming 
		ArrayList<String> arrList = new ArrayList<>();
		arrList.add("mango");
		arrList.add("orange");
		arrList.add("apple");
		System.out.println(arrList);
		
		List<Integer> intList = new ArrayList<>();
		intList.add(5);
		intList.add(2);
		intList.add(2);
		System.out.println(intList);
		
		ArrayList<Object> varList = new ArrayList();
		varList.add("kalai");
		varList.add(23);
		varList.add(40.00);
		varList.add(6868797989L);
		varList.add(-124);
		varList.add('k');
		System.out.println(varList);
		
		varList.set(0, "ganga");
		System.out.println(varList);
		
		System.out.println(varList.get(5));
		
		LinkedList<String> arrList1 = new LinkedList<>();
		arrList1.add("mango");
		arrList1.add("orange");
		arrList1.add("apple");
		System.out.println(arrList);
		

	}

}

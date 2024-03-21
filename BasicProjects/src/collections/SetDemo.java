package collections;

import java.util.TreeSet;

public class SetDemo {
	
//	set - Duplicate not allowed, only unique elements, Unorderd
//	Hashset - hasing
//	LinkedHashset - order,only unique elements
//	Treeset - a.order,sorted
	public static void main(String[] args) {
		
		TreeSet<String> setobj = new TreeSet<>();
		setobj.add("deepa");
		setobj.add("kiruba");
		setobj.add("kunthavai");
		setobj.add("abi");
		setobj.add("arivu");
		setobj.add("deepa");
		System.out.println(setobj);
		}

}

package Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		List<DemoVar> obj = new ArrayList<>();
		
		DemoVar demoVar = new DemoVar();
		demoVar.setName("kalai");
		demoVar.setAge("23");
		demoVar.setFatherName("chinnaiyan");
		demoVar.setMail("cvkalai2001@gmail.com");
		demoVar.setPhone("6385882196");
		
		System.out.println(demoVar.getName());
		System.out.println(demoVar.getAge());
		System.out.println(demoVar.getFatherName());
		System.out.println(demoVar.getMail());
		System.out.println(demoVar.getPhone());
		
		
		ArrayList<String> names = new ArrayList<>();
		
		names.add("kalai");
		names.add("sharu");
		names.add("kiruba");
		
	
		System.out.println("list:"+names);

		names.add("maddy");
		System.out.println(names);

		names.remove("maddy");
		System.out.println(names);
		
		ArrayList list = new  ArrayList();
		
		list.add("kalai");
		list.add(12);
		list.add(-111);
		list.add(749270520740928L);
		list.add(34.33F);
	}

}

package Encapsulation;

//Encapsulation-hiding sensitive data
public class Main {

	public static void main(String[] args) {
		Course course = new Course();
		course.setName("kalai");
		course.setAge(23);
		course.setPhoneNumer(6385882196L);
		
		System.out.println(course.getName());
		System.out.println(course.getAge());
		System.out.println(course.getPhoneNumer());
		
	}
	
}

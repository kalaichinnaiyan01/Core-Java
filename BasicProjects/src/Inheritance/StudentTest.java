package Inheritance;

public class StudentTest extends Student {

		private int id =123;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentTest obj = new StudentTest();
		obj.method();
		System.out.println(obj.id +" "+ obj.name);
	}

}

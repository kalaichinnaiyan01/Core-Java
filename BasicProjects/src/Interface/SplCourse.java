package Interface;

public class SplCourse implements Course {

	@Override
	public void basicCourse() {
		System.out.println("splbasic");

	}

	@Override
	public void advanceCourse() {
	System.out.println("spladvance");
	}
	
	public static void main(String[] args) {
		SplCourse obj = new SplCourse();
		obj.basicCourse();
		obj.advanceCourse();
	}

}

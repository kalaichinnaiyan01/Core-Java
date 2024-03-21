package Interface;

public class Details implements Course {

	@Override
	public void basicCourse() {
	System.out.println("Basic");
		
	}

	@Override
	public void advanceCourse() {
		System.out.println("Advance");
		
	}
	public static void main(String[] args) {
		Details obj = new Details();
		obj.basicCourse();
		obj.advanceCourse();
	}

}

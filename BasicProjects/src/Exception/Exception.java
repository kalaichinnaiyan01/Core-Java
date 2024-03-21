package Exception;

public class Exception {
	
	public static void main(String[] args) {
		try {
		int arr[]= {2,3,4};
		System.out.println(arr[10]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Arithmetic Exception");
		}catch(ExceptionInInitializerError e) {
			System.out.println("exception");
		}finally {
			System.out.println("finally");
		}
	}

}

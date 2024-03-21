package Date;

import java.time.LocalDateTime;

public class DateAndTime {

	public static void main(String[] args) {
		LocalDateTime date = LocalDateTime.now();
		System.out.println(date);
		System.out.println(date.getDayOfMonth());
		System.out.println(date.getDayOfYear());
		System.out.println(date.getMonth());
		System.out.println(date.getHour());
		System.out.println(date.getSecond());
	}

}

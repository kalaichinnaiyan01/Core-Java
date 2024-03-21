package com.kalai.tasks;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DataTypes {
//	Function to do operations with different data types
	
	
	
	public static void main(String[] args) {
		
	LocalDateTime localDateTime = LocalDateTime.of(2023, 10, 7, 15, 50);
	ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, ZoneId.of("Europe/Berlin"));

	System.out.println(localDateTime); // Output: 2023-10-07T15:30
	System.out.println(zonedDateTime); // Output: 2023-10-07T15:30+02:00[Europe/Berlin]

    }
}

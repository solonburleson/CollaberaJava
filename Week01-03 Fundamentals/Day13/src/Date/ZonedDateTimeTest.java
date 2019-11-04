package Date;

import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeTest {

	public static void main(String[] args) {
		ZonedDateTimeTest zonedDateTime = new ZonedDateTimeTest();
		zonedDateTime.testZoneDateTime();
	}
	
	public void testZoneDateTime() {
		ZonedDateTime date1 = ZonedDateTime.parse("2018-12-28T10:15:30+05:30[Asia/Kolkata]");
		System.out.println("date1: " + date1);
		
		ZoneId id = ZoneId.of("Europe/Paris");
		ZonedDateTime parisDateTime = date1.toInstant().atZone(id); 
		System.out.println(parisDateTime);
		
		ZonedDateTime newZonedDateTime = date1.plus(Period.ofDays(4));
		System.out.println(newZonedDateTime);
		
		ZoneId currentZone = ZoneId.systemDefault();
		System.out.println("CurrentZone: " + currentZone);
	}

}

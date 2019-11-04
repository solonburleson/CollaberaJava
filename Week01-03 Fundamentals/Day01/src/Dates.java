import java.text.SimpleDateFormat;
import java.util.Date;

public class Dates {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		
		//display date in mm/dd/yyyy format
		SimpleDateFormat sdf = new SimpleDateFormat("EEEE MM/dd/yyyy hh:mm:ss a z");
		System.out.println(sdf.format(date));

	}

}

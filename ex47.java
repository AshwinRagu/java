 import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class Exercise47 {

	public static void main(String args[]) {
		SimpleDateFormat cdt = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
		cdt.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT")));
		
		System.out.println("\nNow: "+cdt.format(System.currentTimeMillis()));
	}
}
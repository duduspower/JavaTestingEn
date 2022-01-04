import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class Basic47 {
    public static void main(String[]args)
    {
        SimpleDateFormat czas = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss.SSS");
        czas.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT")));
        System.out.println("Teraz : " + czas.format(System.currentTimeMillis()));
    }
}

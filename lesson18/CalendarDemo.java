package lesson18;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by Student on 23.03.2018.
 */
public class CalendarDemo {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar(1994, 0, 6);
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println(calendar.get(Calendar.WEEK_OF_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println(calendar.getTime());
        System.out.println(calendar.getTimeInMillis());
    }
}

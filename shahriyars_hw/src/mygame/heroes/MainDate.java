package mygame.heroes;

import java.util.Calendar;
import java.util.Date;
import java.time.LocalDate;

public class MainDate {
    public static void main(String[] args) {

        Date date = new Date();
        System.out.println("Current date and time: " + date);

        long msec = date.getTime();
        System.out.println("Milliseconds since 1970: " + msec);





        String[] month = {
                "January",
                "February",
                "March",
                "April",
                "May",
                "June",
                "July",
                "August",
                "September",
                "October",
                "November",
                "December"
        };

        Calendar calendar = Calendar.getInstance();
        System.out.println("\nCurrent month: " + month[calendar.get(Calendar.MONTH)]);
        System.out.println("Day of month: " + calendar.get(Calendar.DATE));
        System.out.println("Current year: " + calendar.get(Calendar.YEAR));
        System.out.println("Day of week (number): " + calendar.get(Calendar.DAY_OF_WEEK));


        calendar.add(Calendar.DAY_OF_MONTH, 10);
        System.out.println("Date after 10 days: " + calendar.getTime());


        Calendar birthday = Calendar.getInstance();
        birthday.set(2009, Calendar.MAY, 11);
        int dayOfWeek = birthday.get(Calendar.DAY_OF_WEEK);
        System.out.println("My birthday on 11.05.2009 was on day of week (number): " + dayOfWeek);


        LocalDate today = LocalDate.now();
        System.out.println("\nToday: " + today);
        System.out.println("Day of year: " + today.getDayOfYear());


        LocalDate plus100 = today.plusDays(100);
        System.out.println("Date after 100 days: " + plus100);
        System.out.println("It will be: " + plus100.getDayOfWeek());


        LocalDate last2025 = LocalDate.of(2025, 12, 31);
        System.out.println("\nDecember 31, 2025 is: " + last2025.getDayOfWeek());
        System.out.println("Day of year: " + last2025.getDayOfYear());
    }
}

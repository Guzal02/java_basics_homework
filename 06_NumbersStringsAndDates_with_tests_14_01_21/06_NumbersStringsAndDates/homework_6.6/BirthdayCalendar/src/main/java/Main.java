import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        int day = 31;
        int month = 12;
        int year = 2020;

        System.out.println(collectBirthdays(year, month, day));

    }

    public static String collectBirthdays(int year, int month, int day) {

        //TODO реализуйте метод для построения строки в следующем виде
        //0 - 31.12.1990 - Mon
        //1 - 31.12.1991 - Tue

        StringBuilder everyYearOfBirthday = new StringBuilder();

        Calendar dayOfBirthday = new GregorianCalendar(year, month - 1, day);
        Calendar calendarEnd = Calendar.getInstance();

        long difference = calendarEnd.getTimeInMillis() - dayOfBirthday.getTimeInMillis();
        long minutes = difference /(60 * 60 * 1000);
        float years = (float) minutes / 8760 ;
        System.out.println(years);

        for(int i = 0; i < years; i++) {
            SimpleDateFormat df = new SimpleDateFormat("dd.MM.yyyy - E", Locale.ENGLISH);
            everyYearOfBirthday.append(i).append(" - ").append(df.format(dayOfBirthday.getTime())).append("\n");
            dayOfBirthday.add(Calendar.YEAR, 1);
        }
        return everyYearOfBirthday.toString();
    }
}

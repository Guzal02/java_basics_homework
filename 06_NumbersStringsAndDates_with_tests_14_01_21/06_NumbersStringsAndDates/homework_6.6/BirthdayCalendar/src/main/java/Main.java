import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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

/*        StringBuilder everyYearOfBirthday = new StringBuilder();

        Calendar today = Calendar.getInstance();
        Calendar birthday = Calendar.getInstance();
        birthday.set(year, month - 1, day);
        int i = 0;
        while (birthday.before(today) || today.equals(birthday)) {
            SimpleDateFormat df = new SimpleDateFormat("dd.MM.yyyy - E", Locale.ENGLISH);
            everyYearOfBirthday.append(i).append(" - ").append(df.format(birthday.getTime())).append("\n");
            birthday.add(Calendar.YEAR, 1);
            i++;
        }
        return everyYearOfBirthday.toString();*/
//---------------------------------------------------------------------------------------------------------//
        // Модный вариант - LocalDate
        StringBuilder everyYearOfBirthday = new StringBuilder();
        LocalDate birthday = LocalDate.of(year, month, day);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy - E", Locale.ENGLISH);
        int i = 0;
        while (LocalDate.now().isAfter(birthday.plusYears(i)) || birthday.plusYears(i).equals(LocalDate.now())) {
            everyYearOfBirthday.append(i).append(" - ").append(dateTimeFormatter.format(birthday.plusYears(i))).append("\n");
            i++;
        }
        return everyYearOfBirthday.toString();
    }
}

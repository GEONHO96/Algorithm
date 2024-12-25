import java.time.LocalDate;
import java.time.ZoneId;

public class Main {
    public static void main(String[] args) {
        LocalDate LondonNow = LocalDate.now(ZoneId.of("Europe/London"));
        int year = LondonNow.getYear();
        int month = LondonNow.getMonthValue();
        int day = LondonNow.getDayOfMonth();
        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
    }
}
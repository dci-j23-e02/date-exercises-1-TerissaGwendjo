import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class BirthdayCountdown2 {
        public static void main(String[] args) {
            LocalDate today = LocalDate.now();
            LocalDate birthday = LocalDate.of(1993, 9, 7);

            // Calculate Terissa's next birthday
            LocalDate nextBirthday = LocalDate.of(today.getYear(), birthday.getMonth(), birthday.getDayOfMonth());
            if (nextBirthday.isBefore(today) || nextBirthday.isEqual(today)) {
                nextBirthday = nextBirthday.plusYears(1);
            }

            // Calculate the period between today and the next birthday
            //Period period = Period.between(today, nextBirthday); //Period.between doesn't work here.
            // It gives wrong result. Use ChronoUnit.DAYS
            long daysLeft = ChronoUnit.DAYS.between(today, nextBirthday);

            //Period period = Period.between(today, nextBirthday);
            //int daysLeft = period.getDays();

            //long daysLeft = period.getDays(); with    public static void main(String[] args) {
            // with ChronoUnit.DAYS, you don't need to call 'period.getDays()'
            System.out.println("Days left until Terissa's next birthday: " + daysLeft);
        }
    }



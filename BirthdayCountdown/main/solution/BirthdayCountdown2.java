import java.time.LocalDate;
import java.time.Period;

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
            Period period = Period.between(today, nextBirthday);

            int daysLeft = period.getDays();
            System.out.println("Days left until Terissa's next birthday: " + daysLeft);
        }
    }



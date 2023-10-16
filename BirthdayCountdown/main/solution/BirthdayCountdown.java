import java.time.LocalDate;
import java.time.Period;

public class BirthdayCountdown {
    public static void main(String[]args){

        //Define birthdates of Suze, Karl and Kaiser:
        LocalDate suzeBirthdate = LocalDate.of(2000, 11, 21);
        LocalDate karlBirthdate = LocalDate.of(1993, 9, 7);
        LocalDate kaiserBirthdate = LocalDate.of(1855, 9, 7);

        //Get the current date using the LocalDate.now() method.
        LocalDate currentDate = LocalDate.now();

        //Calculate the next birthdays Calculate the next birthdays of Suze, Karl, and Kaiser.
        // If the birthday this year has already passed, add one year to the birthdate.

        LocalDate nextSuzeBirthday = suzeBirthdate.withYear(currentDate.getYear());
        if (nextSuzeBirthday.isBefore(currentDate) || nextSuzeBirthday.isEqual(currentDate)) {
            nextSuzeBirthday = nextSuzeBirthday.plusYears(1);
        }

        LocalDate nextKarlBirthday = karlBirthdate.withYear(currentDate.getYear());
        if (nextKarlBirthday.isBefore(currentDate) || nextKarlBirthday.isEqual(currentDate)) {
            nextKarlBirthday = nextKarlBirthday.plusYears(1);
        }

        LocalDate nextKaiserBirthday = kaiserBirthdate.withYear(currentDate.getYear());
        if (nextKaiserBirthday.isBefore(currentDate) || nextKaiserBirthday.isEqual(currentDate)) {
            nextKaiserBirthday = nextKaiserBirthday.plusYears(1);
        }

        //Calculate the number of days until the next birthdays of Suze, Karl, and
        // Kaiser using the Period.between(startDate, endDate) method.

        long daysUntilSuzeBirthday = Period.between(currentDate, nextSuzeBirthday).getDays();
        long daysUntilKarlBirthday = Period.between(currentDate, nextKarlBirthday).getDays();
        long daysUntilKaiserBirthday = Period.between(currentDate, nextKaiserBirthday).getDays();


        //Print the number of days until the next birthdays of Suze, Karl, and Kaiser.
        System.out.println("Days until Suze's next birthday: " + daysUntilSuzeBirthday);
        System.out.println("Days until Karl's next birthday: " + daysUntilKarlBirthday);
        System.out.println("Days until Kaiser's next birthday: " + daysUntilKaiserBirthday);


    }
}

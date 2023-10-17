import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class BirthdayCountdown1 {
    public static void main(String[]args){

        LocalDate suzeBirthdate = LocalDate.of(2000, 11, 21);
        LocalDate karlBirthdate = LocalDate.of(1993, 9, 7);
        LocalDate kaiserBirthdate = LocalDate.of(1855, 9, 7);

        System.out.println("Days until Suze's next birthday: " + getDaysUntilNextBirthday(suzeBirthdate));
        System.out.println("Days until Karl's next birthday: " + getDaysUntilNextBirthday(karlBirthdate));
        System.out.println("Days until Kaiser's next birthday: " + getDaysUntilNextBirthday(kaiserBirthdate));


    }
    /*returns: it returns the number of days left until next birthday*/

    public static long getDaysUntilNextBirthday(LocalDate birthdate){
        //Get the current date
        LocalDate currentDate = LocalDate.now();
        //Creating a new 'LocalDate' object that represents the next birthday of the person.
        LocalDate nextBirthday = birthdate.withYear(currentDate.getYear());
        if ((nextBirthday.isBefore(currentDate)) || nextBirthday.isEqual(currentDate)){
            nextBirthday = nextBirthday.plusYears(1);

        }

        //returns number of days between current day and next birthday
        //ChronoUnit.DAYS.between: is a method that works same as Period.between,
        // however it does return the total number of days between both variables
        return ChronoUnit.DAYS.between(currentDate, nextBirthday);
    }

}

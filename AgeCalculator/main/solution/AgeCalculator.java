import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator {
    public static void main(String[]args){

        LocalDate suzeBirthDate = LocalDate.of(2000,11,21);
        //LocalDate SuzeBirthDate = new LocalDate(year, month, dayOfMonth) not possible here
        LocalDate karlBirthdate = LocalDate.of(1993, 9, 7);
        LocalDate kaiserBirthdate = LocalDate.of(1855, 9, 7);


        //calculate the age of each friend from current date using Period.between()
        LocalDate currentDate = LocalDate.now();
        int suzeAge = Period.between(suzeBirthDate, currentDate).getYears();
        int karlAge = Period.between(karlBirthdate, currentDate).getYears();
        int kaiserAge = Period.between(kaiserBirthdate, currentDate).getYears();

        System.out.println("Suze is " + suzeAge + " years old.");
        System.out.println("Karl is " + karlAge + " years old.");
        System.out.println("Kaiser is " + kaiserAge + " years old.");

    }
}

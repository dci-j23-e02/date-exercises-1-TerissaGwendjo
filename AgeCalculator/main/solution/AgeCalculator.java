import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator {
    public static void main(String[]args){

        LocalDate SuzeBirthDate = LocalDate.of(2000,11,21);
        LocalDate karlBirthdate = LocalDate.of(1993, 9, 7);
        LocalDate kaiserBirthdate = LocalDate.of(1855, 9, 7);

        LocalDate currentDate = LocalDate.now();
        int suzeAge = Period.between(SuzeBirthDate, currentDate).getYears();
        int karlAge = Period.between(karlBirthdate, currentDate).getYears();
        int kaiserAge = Period.between(kaiserBirthdate, currentDate).getYears();

        System.out.println("Suze is " + suzeAge + " years old.");
        System.out.println("Karl is " + karlAge + " years old.");
        System.out.println("Kaiser is " + kaiserAge + " years old.");

    }
}

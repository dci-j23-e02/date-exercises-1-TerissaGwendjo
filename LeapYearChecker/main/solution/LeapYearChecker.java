import java.time.Year;

public class LeapYearChecker {
    public static void main(String[]args){

        //Define the years Define the years of birth for Suze, Karl, and Kaiser.
        int suzeBirthYear = 2000;
        int karlBirthYear = 1993;
        int kaiserBirthYear = 1855;

        //Check if the years are leap years Use the isLeap() Using Year.isLeap() is a static method:
        boolean isSuzeBirthYearLeap = Year.isLeap(suzeBirthYear);
        boolean isKarlBirthYearLeap = Year.isLeap(karlBirthYear);
        boolean isKaiserBirthYearLeap = Year.isLeap(kaiserBirthYear);

        System.out.println(suzeBirthYear + " is a leap year: " + isSuzeBirthYearLeap);
        System.out.println(karlBirthYear + " is a leap year: " + isKarlBirthYearLeap);
        System.out.println(kaiserBirthYear + " is a leap year: " + isKaiserBirthYearLeap);

    }
}

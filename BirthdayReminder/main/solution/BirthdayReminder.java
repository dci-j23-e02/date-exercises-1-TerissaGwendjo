import java.util.Calendar;
import java.util.Date;

public class BirthdayReminder {
    public static void main(String[]args){

        Calendar suze= Calendar.getInstance();
        suze.set(2000,10,21);
        Date SuzeBirthDate = suze.getTime();
        System.out.println("Suze: " + SuzeBirthDate);

        Calendar karl = Calendar.getInstance();
        karl.set(1993,8,7);
        Date KarlBirthDate = karl.getTime();
        System.out.println("Karl: " + KarlBirthDate);

        Calendar kaiser = Calendar.getInstance();
        kaiser.set(1855,8,7);
        Date KaiserBirthDate = kaiser.getTime();
        System.out.println("Kaiser: " + KaiserBirthDate);


    }
}

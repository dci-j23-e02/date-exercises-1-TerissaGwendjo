import java.time.LocalDate;

public class ZodiacSignFinder {
    public static void main(String[]args) {
        //Define the birthdates of Suze, Karl,
        // and Kaiser using the LocalDate.of(year, month, day) method.
        LocalDate suzeBirthdate = LocalDate.of(2000, 11, 21);
        LocalDate karlBirthdate = LocalDate.of(1993, 9, 7);
        LocalDate kaiserBirthdate = LocalDate.of(1855, 9, 7);
    }

        //Create a method that takes a LocalDate as a parameter and returns a String representing
        // the zodiac sign. Use the getMonthValue() and getDayOfMonth()
        // methods of the LocalDate class to determine the zodiac sign.

        public static String getZodiacSign(LocalDate birthdate) {
            int month = birthdate.getMonthValue();
            int day = birthdate.getDayOfMonth();

            if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) {
                return "Aries";
            } else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) {
                return "Taurus";
            } else if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) {
                return "Gemini";
            } else if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) {
                return "Cancer";
            } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
                return "Leo";
            } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
                return "Virgo";
            } else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
                return "Libra";
            } else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
                return "Scorpio";
            } else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
                return "Sagittarius";
            } else if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) {
                return "Capricorn";
            } else if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) {
                return "Aquarius";
            } else {
                return "Pisces";
            }
        }

    //Use the getZodiacSign() method to determine the zodiac signs of Suze, Karl, and Kaiser.

     /*   String suzeZodiacSign = getZodiacSign(suzeBirthdate);
        String karlZodiacSign = getZodiacSign(karlBirthdate);
        String kaiserZodiacSign = getZodiacSign(kaiserBirthdate);

        System.out.println("Kaiser's zodiac sign is " + kaiserZodiacSign);
        System.out.println("Suze's zodiac sign is " + suzeZodiacSign);
        System.out.println("Karl's zodiac sign is " + karlZodiacSign);
*/

    }

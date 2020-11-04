package LeapYearCalculator;

public class LeapYear {

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }
        if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0)) {
            return true;
        }
        if ((year % 4 == 0) && (year % 100 != 0)) {
            return true;
        }
        return false;
    }

    public static void displayLeapYear (int year){

        boolean leapYear = isLeapYear(year);

        if (leapYear)
            System.out.println("The year " + year + " is a leap year" );
        else
            System.out.println("The year " + year + " is a not leap year");
    }
}

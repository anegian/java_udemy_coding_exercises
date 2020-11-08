package NumberOfDaysInMonth;

public class Main {

    public static void main(String[] args) {

        boolean answer = isLeapYear(2020);
        System.out.println(answer);
        int days = getDaysInMonth(8,2020);
        System.out.println(days);
    }

    public static boolean isLeapYear(int year){
        if (year < 1 || year > 9999) {
            return false;
        }
        if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0)) {
            return true;
        }
        return (year % 4 == 0) && (year % 100 != 0);
    }

    public static int getDaysInMonth(int month, int year) {

        int days=0;

        if ((month < 1 || month > 12) || (year < 1 || year > 9999)) {
            return -1;
        }else{
            switch (month) {
                case 1: case 3: case 5: case 7: case 8: case 10:case 12:
                    days = 31;
                break;
                case 2:
                    days = 28;
                break;
                case 4: case 6: case 9: case 11:
                days = 30;
            break;
            }
        }
        if (month==2 && isLeapYear(year))
            days = 29;

        return days;
    }
}
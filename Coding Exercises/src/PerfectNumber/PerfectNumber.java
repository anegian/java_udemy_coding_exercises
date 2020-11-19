package PerfectNumber;

public class PerfectNumber {

    public static void main(String[] args) {

        /** if the number is perfect return TRUE */
        boolean isPerfect = isPerfectNumber(28);
        System.out.println(isPerfect);
    }

    /**
     * Perfect NUmber  Όταν το άθροισμα των διαιρετέων ενός αριθμού, ισούται με τον ίδιο τον αριμό
     * i.e  1+2+3=6         Το 6 είναι τέλειος αριθμός
     *      1+2+4+7+14=28   Το 28 είναι τέλειος αριθμός  */
    public static boolean isPerfectNumber(int number) {

        if (number < 1) {
            return false;
        }
        int sum = 0;
        for (int i = (number / 2); i >= 1; i--) {

            if (number % i == 0) {

                sum += i;
            }
        }
        return sum == number;
    }
}

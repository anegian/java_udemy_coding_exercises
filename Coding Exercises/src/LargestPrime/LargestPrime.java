package LargestPrime;

public class LargestPrime {

    public static void main(String[] args) {

        System.out.println(getLargestPrime(45));
    }

    /**
     * Prime number είναι ένας αριθμός ο οποίος παράγεται μόνο απο το γινόμενο του 1 με τον εαυτό του
     * το 1 δεν ειναι prime number, το 2 όμως είναι
     */
    public static int getLargestPrime(int number) {

        if (number <= 1) {
            return -1;
        }

        for ( int i = (number / 2) ; i > 1; --i) {
            if (number % i == 0) {
                number = i;
            }
        }
        return number;
    }
}

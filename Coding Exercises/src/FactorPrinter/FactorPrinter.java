package FactorPrinter;

public class FactorPrinter {

    public static void main(String[] args) {

        printFactors(32);

    }

    /** Print all the divisors of a number that have 0 remainder */
    public static void printFactors(int number) {

        if (number < 1) {
            System.out.println("Invalid Value");
        }

        for (int i = 1; i <= number; i++) {

            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }
}

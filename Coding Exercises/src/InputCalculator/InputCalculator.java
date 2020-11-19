package InputCalculator;

import java.util.Scanner;

public class InputCalculator {

    public static void main(String[] args) {


        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {

        Scanner input = new Scanner(System.in);

        int sum = 0;
        long average = 0;
        int counter = 0;

        while (true) {
            System.out.println("enter number");

            if (input.hasNextInt()) {

                int number = input.nextInt();
                counter++;
                sum += number;
                average = Math.round ((double)sum / counter);
            } else {
                break;
            }
        }
        System.out.println("SUM " + sum + " AVG " + average);
    }
}

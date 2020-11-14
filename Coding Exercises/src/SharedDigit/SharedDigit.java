package SharedDigit;

import jdk.swing.interop.SwingInterOpUtils;

public class SharedDigit {

    public static void main(String[] args) {

        System.out.println(" Do we have shared Digits?\n " + hasSharedDigit(11, 23));
    }

    public static boolean hasSharedDigit(int num1, int num2) {
        int num1LastDigit = num1 % 10;
        int num2LastDigit = num2 % 10;
        int num1FirstDigit = num1 / 10;
        int num2FirstDigit = num2 / 10;

        if ((num1 < 10 || num1 > 99) || (num2 < 10 || num2 > 99)) {
            return false;
        }
        return num1LastDigit == num2LastDigit || num1FirstDigit == num2FirstDigit ||
                num1LastDigit == num2FirstDigit || num2LastDigit == num1FirstDigit;
    }
}


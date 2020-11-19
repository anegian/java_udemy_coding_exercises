package NumberToWordsByReversing;

public class NumberToWords {

    public static void main(String[] args) {

        numberToWords(5);
        System.out.println(reverse(5));

    }

    public static void numberToWords(int number) {

        if (number < 0) {
            System.out.println("Invalid Value");
        }
        if (number == 0) {
            System.out.println("Zero");
        }

        if (getDigitCount(number) >= 1) {

            number = number*10+1;   /**  number * 10 + 1   ONE OPERATION FOR CASE LIKE 100,1000,320 NUMBERS THA THE LAST DIGITS ARE ZERO (0) */
            int reversedNumber = reverse(number);


            while (reversedNumber != 1) {      /** reversedNumber != 1 άρα δε θα συνεχίσει όταν μείνει 1 */

                int lastDigit = reversedNumber % 10;
                reversedNumber /= 10;

                switch (lastDigit) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    default:
                        break;
                }
            }
        }
    }

    public static int reverse(int number) {
        if (number >= 0 && number < 10) {
            return number;
        } else {

            int reversedNUmber = 0;

            while (number != 0) {
                int lastDigit = number % 10;
                    reversedNUmber = reversedNUmber * 10 + lastDigit;
                    number /= 10;
            }
            return reversedNUmber;
        }
    }

    public static int getDigitCount(int number) {
        int countOfDigits = 0;

        if (number < 0) {
            return -1;
        } else if (number == 0) {
            return 1;
        } else
            while (number != 0) {
                number /= 10;
                ++countOfDigits;
            }
        return countOfDigits;
    }
}
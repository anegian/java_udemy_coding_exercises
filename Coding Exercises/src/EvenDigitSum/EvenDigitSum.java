package EvenDigitSum;

public class EvenDigitSum {

    public static void main(String[] args) {

        System.out.println("The sum of the even numbers is: " + getEvenDigitSum(123456));
    }

    public static int getEvenDigitSum(int number) {

        int sumEven = 0;

        if (number < 0) {
            return -1;
        } else
            while (number > 0) {
                int lastDigit = number % 10;

                if (lastDigit % 2 == 0) {
                    sumEven += lastDigit;
                }

                number /= 10;
            }
        return sumEven;
    }
}

package FirstAndLastDigitSum;

public class FirstLastDigitSum {

    public static void main(String[] args) {

        int sum = sumFirstAndLastDigit(8);
        System.out.println(sum);

    }

    public static int sumFirstAndLastDigit(int number) {
        int sum = 0;
        int lastNumberDigit = number % 10;
        int firstDigit = 0;

        if (number < 0) {
            return -1;
        } else if (number < 10) {
            return number * 2;
        } else {
            while (number >= 10) {
                firstDigit = number /= 10;
            }
        }
        sum = lastNumberDigit + firstDigit;
        return sum;
    }

}

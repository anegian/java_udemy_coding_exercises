package NumberPalindromeByReversing;

public class NumberPalindrome {

    public static void main(String[] args) {

       boolean reversedNumber =  isPalindrome(1221);
        System.out.println(reversedNumber);
    }

    public static boolean isPalindrome (int number) {

        int reverse = 0;
        int initialNumber = number;

        while (number != 0){
            int lastDigit = number % 10;

            reverse *= 10;
            reverse += lastDigit;

            number /= 10;
        }
        return reverse==initialNumber;
    }
}


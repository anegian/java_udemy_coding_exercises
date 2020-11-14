package HasSameLastDigit;

public class LastDigitChecker {

    public static void main(String[] args) {

        System.out.println( "Do we have same Last Digits?\n" + hasSameLastDigit(11, 905, 245) );
        System.out.println(isValid(200));
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        int num1LastDigit = num1 % 10;
        int num2LastDigit = num2 % 10;
        int num3LastDigit = num3 % 10;

        if ( (num1 < 10 || num1 > 1000) || (num2 < 10 || num2 > 1000) || (num3<10 || num3 >1000) ){
            return false;
        }

        return (num1LastDigit == num2LastDigit) || (num1LastDigit == num3LastDigit) || (num2LastDigit==num3LastDigit);
    }

    public static boolean isValid (int number){
        return number >= 10 && number <= 1000;
    }
}



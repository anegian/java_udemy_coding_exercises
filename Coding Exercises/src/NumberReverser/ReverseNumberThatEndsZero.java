package NumberReverser;

public class ReverseNumberThatEndsZero {

    public static void main(String[] args) {

        System.out.println( reverse(100) );

        System.out.println(reverseStringBuilder(3560));
    }

    public static String reverse(int number) {
        String input = String.valueOf(number);
        String result = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            result += input.charAt(i);
        }
        return result;
    }

    public static String reverseStringBuilder(int number) {
        String input = String.valueOf(number);
        StringBuilder result = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            result.append(input.charAt(i));
        }
        return result.toString();
    }

}

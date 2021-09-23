package ReverseArray;

import java.util.*;

public class ReverseArray {

    Scanner scanner=new Scanner(System.in);

    private int readInteger() {
        System.out.println("How many integers will you add in your array?");
        int input = 0;

            try {
                input = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Only digits allowed");
            }
        return input;
    }
    private int[] getArray(int size){

        int[] array=new int[size];
        System.out.println("Please enter " + size + " integers!");

        for(int i=0; i<array.length; i++){
            array[i]= scanner.nextInt();
        }
        return array;
    }
    private void reverse(int[] array) {

        System.out.println("The array given is: " + Arrays.toString(array));
        int[] reversedArray = new int[array.length];
        int j= array.length-1;

            for (int i = 0; i < array.length; i++) {
                reversedArray[j] = array[i];
                j--;
        }
        System.out.println("The reversed array is: " + Arrays.toString(reversedArray));
    }
    public void runProcess(){
        reverse( getArray (readInteger() ) );
    }
}

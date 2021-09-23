package ReverseArray;

import java.util.*;

public class ReverseArray {

    private Scanner scanner=new Scanner(System.in);

    public void runProcess(){

        do {
            System.out.println("How many integers will you add in your array?");
            reverseArray(getArray(validateInput()));
        }while (restartOrExit());
        scanner.close();
    }
    private int validateInput() {

        while (!scanner.hasNextInt()){
            System.out.println("This in not valid. Enter an integer.");
            scanner.next();
        }
        return scanner.nextInt();
    }
    private int[] getArray(int size){

        int[] array=new int[size];

                System.out.println("Please enter " + size + " integers!");

            try{
                for (int i = 0; i < array.length; i++) {
                    while (!scanner.hasNextInt()){
                        System.out.println("This in not valid. Enter an integer.");
                        scanner.next();
                    }
                    array[i] = scanner.nextInt();
                }
            }catch(NoSuchElementException e){
                System.out.println("This is not an integer");
                scanner.next();
            }
        return array;
    }
    private void reverseArray(int[] array) {

        System.out.println("The Array given is: " + Arrays.toString(array));
        int[] reversedArray = new int[array.length];
        int j= array.length-1;

            for (int i = 0; i < array.length; i++) {
                reversedArray[j] = array[i];
                j--;
        }
        System.out.println("The Reversed Array is: " + Arrays.toString(reversedArray));
    }
    private boolean restartOrExit(){
        System.out.println("Do you want to restart? -> Press Y\nDo you wish to exit the program? -> Press anything else.");
        String answer= scanner.next();

        if (answer.equalsIgnoreCase("Y")) {
            return true;
        }else {
            System.out.println(" 3...");
            System.out.println(" 2...");
            System.out.println(" 1...\n Exiting program...");
            return false;
        }
    }
}

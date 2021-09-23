package MinimumElement;

import java.util.Scanner;

public class MinimumElement {

    private Scanner scanner = new Scanner(System.in);

    public int readInteger(){

        System.out.println("Give a number");
        int input=scanner.nextInt();

        return input;
    }

    public int[] readElements(int input){

        int[] array = new int[input];
        System.out.println("You need to enter " + input + " elements!!");

        for(int i=0; i<array.length; i++){
            array[i]= scanner.nextInt();
        }
        return array;
    }
    public int findMin(int[] array ){
        int minValue=array[0];

        for (int i = 0; i<array.length; i++ ){
            if(array[i]<minValue)
             minValue=array[i];
        }
        return minValue;
    }
}

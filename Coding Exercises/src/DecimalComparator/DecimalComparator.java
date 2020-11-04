package DecimalComparator;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double value1, double value2){

        int a = (int) (value1*1000) ;
        int b = (int) (value2*1000);

        return a == b;
    }
}

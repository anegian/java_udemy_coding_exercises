package BarkingDog;

public class BarkingDog {
    /** if on line 8 can be simplified --> return barking && hourOfDay < 8 || hourOfDay > 22;*/
    public static boolean shouldWakeUp(boolean barking , int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }else if (barking && hourOfDay < 8 || hourOfDay > 22) {
            return true;
        }
        return false;
    }
}
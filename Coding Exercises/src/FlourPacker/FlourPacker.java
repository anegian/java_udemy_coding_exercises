package FlourPacker;

public class FlourPacker {

    public static void main(String[] args) {

        System.out.println(canPack(2, 7, 13));
    }


    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        int divisor;
        if ( (bigCount * 5) + smallCount >= goal) {
            divisor = goal / 5;
            if (goal >= 5) {
                while (bigCount > 0) {
                    goal -= 5;
                    bigCount--;
                    divisor--;
                    if (divisor <= 0) {
                        break;
                    }
                }
            }
        }
        return smallCount >= goal;
    }
}
package GreatestCommonDivisor;

public class GreatestCommonDivisor {

    public static void main(String[] args) {

        System.out.println(getGreatestCommonDivisor(53, 63));
    }

    public static int getGreatestCommonDivisor(int first, int second) {

        if (first < 10 || second < 10) {
            return -1;
        }
        /** Math.min παίρνει το μικρότερο αριθμό από τους δύο και τον θέτει ως divisor */
        int divisor = Math.min(first, second);

        /** στην περίπτωση που ο μικρότερος αριθμος μεταξύ των είναι και διαιρέτης του μεγαλύτερου με πηλίκο 0
         * γίνεται αυτόματα  ο μέγιστος κοινός διαιρέτης */
        if (first % divisor == 0 && second % divisor == 0) {
            return divisor;
        }
        /** μέσα στην for το i αρχικοποιείται ως το μισό του μικρότερου αριθμού εκ των δύο που μας δώθηκαν
         * με βήμα -1 κάθε φορά και i >0,  */
        for (int i = (divisor / 2); i > 0; --i) {
            if ((first % i == 0) && (second % i == 0)) {
                return i;

            }
        }
        return -1;
    }
}

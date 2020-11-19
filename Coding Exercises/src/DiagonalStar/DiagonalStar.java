package DiagonalStar;

public class DiagonalStar {

    public static void main(String[] args) {

        printSquareStar(20);
    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {

            for (int i = number; i > 0; i--) {
                for (int j = number; j > 0; j--) {

                    if (i == number || i == 1) {
                        System.out.print("*");
                    } else if (j == number || j == 1) {
                        System.out.print("*");
                    } else if (j == i) {
                        System.out.print("*");
                    } else if (j == number - i + 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }

                }

                System.out.println("");

            }
        }

    }
}


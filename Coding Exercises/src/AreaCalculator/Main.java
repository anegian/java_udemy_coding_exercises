package AreaCalculator;

public class Main {

    public static void main(String[] args) {

        double areaCircleOperation = AreaCalculator.area(5.0);
        if (areaCircleOperation < 0.0) {
            System.out.println("Invalid Value\n");
        }
            System.out.println(areaCircleOperation);
        double areaRectangleOperation = AreaCalculator.area(5.0,4.0);
        if (areaRectangleOperation < 0.0) {
            System.out.println("Invalid Value\n");
        }
            System.out.println(areaRectangleOperation);
    }
}

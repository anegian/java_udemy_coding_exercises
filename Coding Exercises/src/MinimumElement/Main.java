package MinimumElement;

public class Main {

    public static void main(String[] args) {

       MinimumElement minimumElement=new MinimumElement();

       int element = minimumElement.findMin(minimumElement.readElements(minimumElement.readInteger()));
        System.out.println("The minimum Element is: " + element);
    }
}

package MasterExerciseInOOP;

public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");

        hamburger.addHamburgerAddition1("Tomato", 0.3);
        hamburger.addHamburgerAddition2("Lettuce", 0.5);
        hamburger.addHamburgerAddition3("Cheese", 1.2);

        double price = hamburger.itemizeHamburger();
        System.out.println( "Total price:" + price + "$\n");

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);

        healthyBurger.addHealthyAddition1("Egg", 0.8);
        hamburger.addHamburgerAddition2("Lettuce", 0.5);
        hamburger.addHamburgerAddition3("Cheese", 1.2);

        System.out.println( "Total price:" + healthyBurger.itemizeHamburger() + "$\n" );

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.addHamburgerAddition1("sth", 6);
        deluxeBurger.itemizeHamburger();
    }
}

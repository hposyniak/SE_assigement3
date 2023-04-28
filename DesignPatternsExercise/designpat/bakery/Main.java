package designpat.bakery;

/**
 * Create an order and print it
 */
public class Main {
    public static void main(String[] args) {
        // Create the order
        Order order = new Order();
        order.addCake(new ChocolateCake());
        order.addCake(new SayingX(new VanillaCake(), "PLAIN!"));
        order.addCake(new SayingX( new Sprinkles( new VanillaCake()) , "FANCY"));
        order.addCake(new SayingX(new SayingX(new MultiLayer(new StrawberryCake()), "One of"), "EVERYTHING"));


        // Print the order
        order.printOrder();
    }
}

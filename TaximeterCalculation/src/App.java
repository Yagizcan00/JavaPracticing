import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Define variables.
        double km, price, totalPrice;

        // Add Scanner Class.
        try (Scanner inp = new Scanner(System.in)) {

            // Take the input from user.
            System.out.print("\nPlease enter your km value : ");

            km = inp.nextDouble();
        }

        // Price for km.
        price = km * 2.2;

        // Calculate how much pay.
        if (price <= 20) {
            totalPrice = 20;
        } else {
            totalPrice = price + 10;
        }

        // Show the total price for journey.
        System.out.println("\nThat is your total price for your journey = " + totalPrice + "\n");

    }
}

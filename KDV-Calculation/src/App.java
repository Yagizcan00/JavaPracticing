import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Define variables.
        double price, kdvPrice, lastKdvPrice;

        // Add Scanner class.
        try (Scanner inp = new Scanner(System.in)) {

            System.out.print("Enter your price : ");
            price = inp.nextDouble();
        }

        // Calculate the new price.
        kdvPrice = price + (price * 0.18);
        lastKdvPrice = kdvPrice > 1000 ? price + (price * 0.08) : price + (price * 0.18);

        // Show new price.
        System.out.println("This is your new price with add KDV : " + lastKdvPrice);

    }
}

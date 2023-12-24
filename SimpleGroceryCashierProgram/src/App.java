import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Define variables.
        double pear, apple, tomato, banana, aubergine, totalPrice;

        // Add Scanner Class.
        try (Scanner inp = new Scanner(System.in)) {

            // Get how much of each item was taken.
            System.out.println("\nPlease enter how much of each item you want to buy : ");

            System.out.print("\nPear = ");
            pear = inp.nextDouble();

            System.out.print("\nApple = ");
            apple = inp.nextDouble();

            System.out.print("\nTomato = ");
            tomato = inp.nextDouble();

            System.out.print("\nBanana = ");
            banana = inp.nextDouble();

            System.out.print("\nAubergine = ");
            aubergine = inp.nextDouble();
        }

        // Calculate the total price.
        totalPrice = (pear * 2.14) + (apple * 3.67) + (tomato * 1.11) + (banana * 0.95) + (aubergine * 5.00);

        // Show the total price.
        System.out.println("\nThere is your total price for your bought = " + totalPrice + "\n");
    }
}

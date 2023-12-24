import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Define the variables.
        double weight, length, index;

        // Add Scanner Class.
        try (Scanner inp = new Scanner(System.in)) {

            // Take body kg and length cm.
            System.out.println("\nPlease enter your body's weight (kg) and length (m) value :");

            System.out.print("\nWeight = ");
            weight = inp.nextDouble();

            System.out.print("\nLength (please use ',' for fraction) = ");
            length = inp.nextDouble();
        }

        // Calculate the body mass index.
        index = weight / (length * length);

        // Show the result.
        System.out.println("\nThere is your index : " + index + "\n");
    }
}

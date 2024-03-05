import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // Defining the variables.
        double mathematics, physics, turkish, chemistry, music, average;

        // Adding Scanner Class.
        try (Scanner input = new Scanner(System.in)) {

            System.out.println("Please enter your notes : ");

            System.out.println("\nMathematics = ");
            mathematics = input.nextDouble();

            System.out.println("\nPhysics = ");
            physics = input.nextDouble();

            System.out.println("\nTurkish = ");
            turkish = input.nextDouble();

            System.out.println("\nChemistry = ");
            chemistry = input.nextDouble();

            System.out.println("\nMusic = ");
            music = input.nextDouble();
        }

        // Calculate the situation about the pass or fail.
        average = (mathematics + physics + turkish + chemistry + music) / 5;

        if (average >= 55) {
            System.out.println("\nHere is your note : " + average + " You passed !");
        } else {
            System.out.println("\nHere is your note : " + average + " You failed !");
        }

    }
}

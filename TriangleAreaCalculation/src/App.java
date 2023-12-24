import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Define variables.
        double firstEdge, secondEdge, thirdEdge, u, area;

        // Add Scanner Class.
        try (Scanner inp = new Scanner(System.in)) {

            // Take inputs.
            System.out.println("\nPlease enter your how long your triangle's edges one by one :");

            System.out.print("\nFirst edge = ");
            firstEdge = inp.nextDouble();

            System.out.print("\nSecond edge = ");
            secondEdge = inp.nextDouble();

            System.out.print("\nThird edge = ");
            thirdEdge = inp.nextDouble();
        }

        // Calculate the triangle's area value.
        u = (firstEdge + secondEdge + thirdEdge) / 2;
        area = Math.sqrt(u * (u - firstEdge) * (u - secondEdge) * (u - thirdEdge));

        // Show the result.
        System.out.println("\nThats your triangle's area value : " + area + "\n");

    }
}

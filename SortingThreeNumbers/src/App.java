import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Created variables.
        int a, b, c;

        // Added Scanner Class.
        Scanner input = new Scanner(System.in);

        // Took inputs from user.
        System.out.print("\nPlease enter the first integer : ");
        a = input.nextInt();

        System.out.print("\nPlease enter the second integer : ");
        b = input.nextInt();

        System.out.print("\nPlease enter the third integer : ");
        c = input.nextInt();

        // Closed input and Scanner Class.
        input.close();

        // Sorting integers.
        if (a > b && a > c) {
            if (b > c) {
                System.out.println("\nThe sort = " + a + " > " + b + " > " + c + "\n");
            } else {
                System.out.println("\nThe sort = " + a + " > " + c + " > " + b + "\n");
            }
        } else if (b > a && b > c) {
            if (a > c) {
                System.out.println("\nThe sort = " + b + " > " + a + " > " + c + "\n");
            } else {
                System.out.println("\nThe sort = " + b + " > " + c + " > " + a + "\n");
            }
        } else if (c > a && c > b) {
            if (a > b) {
                System.out.println("\nThe sort = " + c + " > " + a + " > " + b + "\n");
            } else {
                System.out.println("\nThe sort = " + c + " > " + b + " > " + a + "\n");
            }
        }
    }
}

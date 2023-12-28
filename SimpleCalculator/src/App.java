import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Define the variables.
        int number1, number2, processType, result = 0;

        // Add Scanner Class.
        try (Scanner inp = new Scanner(System.in)) {

            // Take first number from user.
            System.out.print("\n\nPlease enter the first number = ");
            number1 = inp.nextInt();

            // Take second number from user.
            System.out.print("\nPlease enter the second number = ");
            number2 = inp.nextInt();

            // Take process type from user.
            System.out.print("\nPlease choose any process type :\n\n1-Plus\n2-Minus\n3-Multiply\n4-Divide\n");
            processType = inp.nextInt();
        }

        // Make a calculation.
        switch (processType) {
            case 1:
                result = number1 + number2;
                break;
            case 2:
                result = number1 - number2;
                break;
            case 3:
                result = number1 * number2;
                break;
            case 4:
                result = number1 / number2;
                break;
        }

        // Show the result.
        System.out.println("\nHere is your result = " + result + "\n");
    }
}

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        try (Scanner input = new Scanner(System.in)) {

            // Taking input.
            System.out.print("\nPlease enter the temperature : ");
            double temperature = input.nextDouble();

            // Calculate input's status and suggest the right activity to user.
            if (temperature < 5) {
                System.out.println("\nOur suggest is to ski because temperature less than five.\n");
            } else if (temperature >= 5 && temperature < 15) {
                System.out.println(
                        "\nOur suggest is going to cinema because temperature less than fifteen and more than five.\n");
            } else if (temperature >= 15 && temperature < 25) {
                System.out.println(
                        "\nOur suggest is making picnic because temperature less than twentyfive and more than fifteen.\n");
            } else {
                System.out.println(
                        "\nOur suggest is going to swimming because temperature more than twenty five.\n");
            }
        }
    }
}

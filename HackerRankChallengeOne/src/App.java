import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Read the number of test cases
        int t = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Iterate through each test case
        for (int i = 0; i < t; i++) {
            // Read the input number
            long n = scanner.nextLong();
            scanner.nextLine(); // Consume newline

            // Check which data types can fit the input number
            StringBuilder result = new StringBuilder(n + " can be fitted in:\n");
            if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) {
                result.append("* byte\n");
            }
            if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) {
                result.append("* short\n");
            }
            if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) {
                result.append("* int\n");
            }
            if (n >= Long.MIN_VALUE && n <= Long.MAX_VALUE) {
                result.append("* long\n");
            }

            // Print the result
            if (result.toString().equals(n + " can be fitted in:\n")) {
                System.out.println(n + " can't be fitted anywhere.");
            } else {
                System.out.print(result);
            }
        }

        scanner.close();
    }
}

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        // Our variables.
        int class1, class2, class3, class4;

        try (
                // Define the Scanner func.
                Scanner inp = new Scanner(System.in)) {
            // Take classes.
            System.out.print("Write here your Class notes:\n");
            class1 = inp.nextInt();
            class2 = inp.nextInt();
            class3 = inp.nextInt();
            class4 = inp.nextInt();
        }

        // Take average note.
        int total = class1 + class2 + class3 + class4;
        double reasult = (double) total / 4;

        // Show average note.
        System.out.println("Here is your average note : " + reasult);

        // Calculate pass or fail.
        if (reasult >= 50) {
            System.out.println("You passed.");
        } else {
            System.out.println("You failed.");
        }

    }
}

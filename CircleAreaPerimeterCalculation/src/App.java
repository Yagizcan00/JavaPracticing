import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Define variables.
        double pi, radius, area, perimeter, alpha, circleSliceArea;

        // Add Scanner Class.
        try (Scanner inp = new Scanner(System.in)) {

            // Take radius value from user.
            System.out.print("\nPlease enter your circle's radius value : ");

            radius = inp.nextDouble();

            // Take radius value from user.
            System.out.print("\nAnd now please enter your central angle : ");

            alpha = inp.nextDouble();
        }

        // Calculate the area and perimeter (pi = 3.14).
        pi = 3.14;
        area = pi * radius * radius;
        perimeter = 2 * pi * radius;

        // Show the area and perimeter.
        System.out.println("\nThere is your circle's area and perimeter value :");
        System.out.println("\nArea = " + area);
        System.out.println("\nPerimeter = " + perimeter);

        // Calculate the slice area of circle.
        circleSliceArea = (pi * (radius * radius) * alpha) / 360;

        // Show the slice area of circle.
        System.out.println("\nThere is the slice area of your circle's = " + circleSliceArea + "\n");

    }
}

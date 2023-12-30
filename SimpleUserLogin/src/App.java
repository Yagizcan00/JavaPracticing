import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Define the variables.
        String userName1 = "";
        String userPassword1 = "";
        String userName2 = "";
        String userPassword2 = "";
        Boolean userExistCheck = false;
        Boolean userInformation = true;

        // Add Scanner Class.
        try (Scanner inp = new Scanner(System.in)) {

            while (userExistCheck == false) {

                // If user profile not exist just create one.
                System.out.print("\nYou don't have a profile yet, let's create one.");

                System.out.println("\n\nPlease create a Username & Password :");

                System.out.print("\nUsername = ");
                userName1 = inp.nextLine();

                System.out.print("\nPassword = ");
                userPassword1 = inp.nextLine();

                System.out.println("\nYour profile created.");

                // Change the userExistCheck.
                userExistCheck = true;
            }

            // After create user profile, take username and password and check they correct
            // or not.
            System.out.println("\nPlease enter your Username & Password :");

            System.out.print("\nUsername = ");
            userName2 = inp.nextLine();

            System.out.print("\nPassword = ");
            userPassword2 = inp.nextLine();

            while (userInformation) {

                if (!userName1.equals(userName2) || !userPassword1.equals(userPassword2)) {

                    // If username or password isn't correct, make user try again.
                    System.out.println("\nUsername or Password isn't correct please try again!");

                    System.out.println("\nPlease enter your Username & Password :");

                    System.out.print("\nUsername = ");
                    userName2 = inp.nextLine();

                    System.out.print("\nPassword = ");
                    userPassword2 = inp.nextLine();

                } else {

                    System.out.println("\nUsername & Password is correct. Welcome your profile.\n");
                    userInformation = false;

                }
            }
        }
    }
}

import java.util.Scanner;

public class Main {

    public static String maskEmail(String email) {

        // Remove leading and trailing spaces
        email = email.trim();

        // Find the @ symbol
        int atPosition = email.indexOf('@');

        // Check if @ is missing
        if (atPosition == -1) {
            return "Invalid Email";
        }

        // Get username and domain
        String username = email.substring(0, atPosition);
        String domain = email.substring(atPosition + 1).toLowerCase();

        // If username has 2 characters or fewer
        if (username.length() <= 2) {
            return username + "@" + domain;
        }

        // Keep first two characters
        String masked = username.substring(0, 2);

        // Replace remaining characters with *
        for (int i = 2; i < username.length(); i++) {
            masked += "*";
        }

        return masked + "@" + domain;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter email: ");
        String email = input.nextLine();

        System.out.println(maskEmail(email));

        input.close();
    }
}

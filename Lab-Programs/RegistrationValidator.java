import java.util.Scanner;

// User-defined Exception
class WeakPasswordException extends Exception {
    WeakPasswordException(String msg) {
        super(msg);
    }
}

public class RegistrationValidator {

    static void validatePassword(String password)
            throws WeakPasswordException {

        boolean hasDigit = false;

        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                hasDigit = true;
                break;
            }
        }

        if (password.length() < 8 || !hasDigit) {
            throw new WeakPasswordException(
                "Weak Password! Password must contain at least 8 characters and one number."
            );
        }

        System.out.println("Account Created Successfully.");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        try {
            validatePassword(password);
        }
        catch (WeakPasswordException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}



public class NestedIfElse {
    public static void main(String[] args) {

        int age = 25;
        boolean hasLicense = true;

        if (age >= 18) {

            if (hasLicense) {
                System.out.println("Can Drive");
            } else {
                System.out.println("License Required");
            }

        } else {
            System.out.println("Underage");
        }
    }
}
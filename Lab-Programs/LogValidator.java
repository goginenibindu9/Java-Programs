public class LogValidator {

    // Method to validate IP address
    static boolean isValidIP(String ip) {
        String[] parts = ip.split("\\.");

        if (parts.length != 4)
            return false;

        for (String p : parts) {
            try {
                int num = Integer.parseInt(p);

                if (num < 0 || num > 255)
                    return false;
            } catch (Exception e) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String data =  "User1;192.168.1.10|Login;300.10.20.5|User2;10.0.0.1|Logout";

        // Split using ; and |
        String[] tokens = data.split("[;|]");

        System.out.println("Cleaned Data:");
        for (String t : tokens) {
            System.out.println(t);

            if (t.matches("\\d+\\.\\d+\\.\\d+\\.\\d+")) {
                if (isValidIP(t))
                    System.out.println("Valid IP Address");
                else
                    System.out.println("Invalid (Spoofed) IP Address");
            }
        }
    }
}


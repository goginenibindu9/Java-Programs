class User {
    void read() {
        System.out.println("Reading data...");
    }
}

// Guest Class
class Guest extends User {
    // Can only read data
}

// Admin Class
class Admin extends User {
    void write() {
        System.out.println("Writing data...");
    }

    void delete() {
        System.out.println("Deleting data...");
    }
}

// Main Class
public class PermissionSystem {
    public static void main(String[] args) {

        Guest g = new Guest();
        Admin a = new Admin();

        System.out.println("Guest User:");
        g.read();

        System.out.println();

        System.out.println("Admin User:");
        a.read();
        a.write();
        a.delete();
    }
}

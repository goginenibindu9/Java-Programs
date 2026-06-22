abstract class Employee {

    // Abstract method
    abstract void work();

    // Concrete method
    void login() {
        System.out.println("Employee logged in");
    }
}

class TeachingStaff extends Employee {
    void work() {
        System.out.println("Teaching staff is teaching students.");
    }
}

class NonTeachingStaff extends Employee {
    void work() {
        System.out.println("Non-teaching staff is managing administration.");
    }
}

public class AbstractEmployee {
    public static void main(String[] args) {

        Employee e1 = new TeachingStaff();
        Employee e2 = new NonTeachingStaff();

        e1.login();
        e1.work();

        System.out.println();

        e2.login();
        e2.work();
    }
}
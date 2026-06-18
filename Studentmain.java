// Class Definition
class Student {

    // Instance Variables (Data Members)
    String name;
    int age;

    // Constructor for Object Initialization
    Student(String n, int a) {
        name = n;
        age = a;
        System.out.println("Object Created: " + name);
    }

    // Method
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age : " + age);
    }

    // finalize() method (called before garbage collection)
    protected void finalize() {
        System.out.println(name + " object is garbage collected");
    }
}

// Main Class
public class Studentmain {

    public static void main(String[] args) {

        // Creating Objects
        Student s1 = new Student("Ravi", 20);
        Student s2 = new Student("Priya", 21);

        // Accessing Method using Objects
        s1.display();
        s2.display();

        // Making objects eligible for Garbage Collection
        s1 = null;
        s2 = null;

        // Request JVM to run Garbage Collector
        System.gc();

        System.out.println("End of Program");
    }
}

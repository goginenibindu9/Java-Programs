abstract class Student {
    abstract void study();

    void attendClass() {
        System.out.println("Student is attending class");
    }
}

class BTechStudent extends Student {
    void study() {
        System.out.println("Studying Engineering subjects");
    }
}

class MBAStudent extends Student {
    void study() {
        System.out.println("Studying Management subjects");
    }
}

public class AbstractCollegeManagement {
    public static void main(String[] args) {
        Student s1 = new BTechStudent();
        Student s2 = new MBAStudent();

        s1.attendClass();
        s1.study();

        s2.attendClass();
        s2.study();
    }
}

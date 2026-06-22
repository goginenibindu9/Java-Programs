interface Father {
    void property1();
}

interface Mother {
    void property2();
}

class Child implements Father, Mother {

    public void property1() {
        System.out.println("Property from Father");
    }

    public void property2() {
        System.out.println("Property from Mother");
    }
}

public class MultipleDemo {
    public static void main(String[] args) {
        Child c = new Child();
        c.property1();
        c.property2();
    }
}

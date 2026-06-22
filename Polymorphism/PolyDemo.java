// Parent Class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child Class 1
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Child Class 2
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

// Child Class 3
class Cow extends Animal {
    @Override
    void sound() {
        System.out.println("Cow moos");
    }
}

public class PolyDemo {
    public static void main(String[] args) {

        Animal a;

        a = new Dog();   // Upcasting
        a.sound();

        a = new Cat();   // Upcasting
        a.sound();

        a = new Cow();   // Upcasting
        a.sound();
    }
}

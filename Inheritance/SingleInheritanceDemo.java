// Parent Class
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Child Class
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Main Class
public class SingleInheritanceDemo {
    public static void main(String[] args) {
        Dog d = new Dog();

        d.eat();   // inherited from Animal
        d.bark();  // Dog's own method
    }
}
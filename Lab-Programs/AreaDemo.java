class AreaCalculator {

    // Area of Square
    void calculateArea(int side) {
        int area = side * side;
        System.out.println("Area of Square = " + area);
    }

    // Area of Rectangle
    void calculateArea(int length, int breadth) {
        int area = length * breadth;
        System.out.println("Area of Rectangle = " + area);
    }

    // Area of Circle
    void calculateArea(double radius) {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle = " + area);
    }
}

public class AreaDemo {
    public static void main(String[] args) {

        AreaCalculator obj = new AreaCalculator();

        obj.calculateArea(5);        // Square
        obj.calculateArea(10, 5);    // Rectangle
        obj.calculateArea(7.0);      // Circle
    }
}


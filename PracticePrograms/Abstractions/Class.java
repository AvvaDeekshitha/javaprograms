abstract class Shape {
    abstract void area();
}

class Circle extends Shape {
    double radius = 5;

    void area() {
        System.out.println("Area of Circle = " + (3.14 * radius * radius));
    }
}

class Rectangle extends Shape {
    int length = 10, width = 5;

    void area() {
        System.out.println("Area of Rectangle = " + (length * width));
    }
}

public class class {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();

        c.area();
        r.area();
    }
}

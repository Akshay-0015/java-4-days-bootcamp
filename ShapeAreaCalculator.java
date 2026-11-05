abstract class Shape {

    abstract double calculateArea();
}

// Circle class
class Circle extends Shape {

    double radius;

    Circle(double r) {

        radius = r;
    }

    double calculateArea() {

        return 3.14 * radius * radius;
    }
}

// Rectangle class
class Rectangle extends Shape {

    double length;
    double width;

    Rectangle(double l, double w) {

        length = l;
        width = w;
    }

    double calculateArea() {

        return length * width;
    }
}

// Triangle class
class Triangle extends Shape {

    double base;
    double height;

    Triangle(double b, double h) {

        base = b;
        height = h;
    }

    double calculateArea() {

        return 0.5 * base * height;
    }
}

public class ShapeAreaCalculator {

    public static void main(String[] args) {

        // Creating objects
        Circle c = new Circle(5);
        Rectangle r = new Rectangle(10, 5);
        Triangle t = new Triangle(8, 6);

        // Using Shape reference
        Shape s;

        s = c;
        System.out.println("Area of Circle: " + s.calculateArea());

        s = r;
        System.out.println("Area of Rectangle: " + s.calculateArea());

        s = t;
        System.out.println("Area of Triangle: " + s.calculateArea());
    }
}
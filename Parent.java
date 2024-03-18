class Shape {
    public void draw() {
        System.out.println("Drawing a shape");
    }

    public void draw(String color) {
        System.out.println("Drawing a shape with color " + color);
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }

    public void draw(String color, int radius) {
        System.out.println("Drawing a circle with color " + color + " and radius " + radius);
    }
}

public class Parent {

    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.draw();
        shape.draw("red");

        Circle circle = new Circle();
        circle.draw();
        circle.draw("blue", 5);
    }
}

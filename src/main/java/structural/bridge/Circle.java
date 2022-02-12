package structural.bridge;

public class Circle extends Shape{

    private final double radius;

    public Circle(double radius) {
        System.out.printf("A circle with a radius %s is created %n", radius);
        this.radius = radius;
    }

    @Override
    void drawShape() {
        System.out.println("Drawing a circle");
    }

    @Override
    double getArea() {
        return Math.PI*Math.pow(radius, 2);
    }
}

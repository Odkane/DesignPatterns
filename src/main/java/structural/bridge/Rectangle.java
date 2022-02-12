package structural.bridge;

public class Rectangle extends Shape{

    private final double length;
    private final double width;


    public Rectangle(double length ,double width) {
        System.out.printf("A Rectangle with a length : %s and a width : %s is created%n", length, width);
        this.length = length;
        this.width = width;
    }

    @Override
    void fillShape() {
        this.color.fill();
    }

    @Override
    void drawShape() {
        System.out.println("Drawing a rectangle");
    }

    @Override
    double getArea() {
        return length * width;
    }
}

package structural.bridge;

public class Client {

    public static void main(String[] args) {
        System.out.println("Defining Shape 1 : ");
        Shape circle = new Circle(5.0);
        circle.setColor(new RedColor());

        circle.fillShape();
        System.out.println("Area of the shape 1 : " + circle.getArea());

        System.out.println("------------------------------------------");
        System.out.println("Defining Shape 2 : ");
        Shape rectangle = new Rectangle(8.2,4);
        rectangle.setColor(new BlueColor());

        rectangle.fillShape();
        System.out.println("Area of the shape 2 : " + rectangle.getArea());
    }
}

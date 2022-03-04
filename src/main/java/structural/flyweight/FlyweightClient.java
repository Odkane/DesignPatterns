package structural.flyweight;

import static structural.flyweight.Color.getRandomColor;

public class FlyweightClient {
    public static void main(String[] args) {

        for(int i=0; i < 30; ++i) {
            Circle circle = (Circle)ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }

    private static int getRandomX() {
        return (int)(Math.random()*100 );
    }
    private static int getRandomY() {
        return (int)(Math.random()*100);
    }
}

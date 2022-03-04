package structural.flyweight;

import java.util.HashMap;

public class ShapeFactory {


    private static final HashMap<Color, Circle> circleMap = new HashMap<>();

    public static Shape getCircle(Color color) {
        Circle circle = circleMap.get(color);

        if(circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}
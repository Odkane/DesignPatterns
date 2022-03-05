package structural.flyweight;

import java.util.Random;

public enum Color {

    BLUE("blue"), GREEN("green"), YELLOW("yellow"), WHITE("white"), BLACK("black");

    private final String colorName;

    Color(String colorName) {
        this.colorName = colorName;
    }

    public String getName() {
        return colorName;
    }

    static Color getRandomColor() {
        return values()[new Random().nextInt(values().length)];
    }
}

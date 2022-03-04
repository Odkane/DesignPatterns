package structural.flyweight;

import java.util.Random;

public enum Color {

    BLUE("Blue"), GREEN("Green"), YELLOW("Yellow"), WHITE("White"), BLACK("Black");

    Color(String color) {

    }

    static Color getRandomColor() {
        return values()[new Random().nextInt(values().length)];
    }
}

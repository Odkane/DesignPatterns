package structural.flyweight;

import java.util.Random;

public enum Brand {

    AUDI("Audi"),
    BMW("BMW"),
    FORD("Ford"),
    SEAT("Seat"),
    TESLA("Tesla"),
    CUPRA("Cupra"),
    OPEL("Opel");

    Brand(String brandName) {
    }

    static Brand getRandomBrand() {
        return values()[new Random().nextInt(values().length)];
    }
}

package structural.flyweight;

import lombok.Getter;
import java.util.Random;

import static lombok.AccessLevel.PRIVATE;

@Getter(PRIVATE)
public enum Brand {

    AUDI("Audi"),
    BMW("BMW"),
    FORD("Ford"),
    SEAT("Seat"),
    TESLA("Tesla"),
    CUPRA("Cupra"),
    OPEL("Opel");

    private final String brandName;

    Brand(String brandName) {
        this.brandName=brandName;
    }

    static Brand getRandomBrand() {
        return values()[new Random().nextInt(values().length)];
    }
}

package structural.flyweight;

import java.util.HashMap;
import java.util.Optional;

public class VehicleFactory {

    private final static HashMap<MapKeySet, Car> circleMap = new HashMap<>();

    public static Vehicle getCar(Color color, Brand brand) {

        Car car = null;
        Optional<MapKeySet> key = circleMap.keySet().stream().filter((k) -> color.equals(k.color) && brand.equals(k.brand)).findAny();
        if (key.isPresent()) {
            car = circleMap.get(key.get());
        }

        if(car == null) {
            car = new Car(color,brand);
            circleMap.put(new MapKeySet(color,brand), car);
            car.createVehicle();
        }

        return car;
    }

    static class MapKeySet {
        Color color;
        Brand brand;

        public MapKeySet(Color color, Brand brand) {
            this.color = color;
            this.brand = brand;
        }
    }

}

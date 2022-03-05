package structural.flyweight;

import static structural.flyweight.Brand.getRandomBrand;
import static structural.flyweight.Color.getRandomColor;

public class FlyweightClient {
    public static void main(String[] args) {

        for(int i=0; i < 30; ++i) {
            Vehicle car = VehicleFactory.getCar(getRandomColor(), getRandomBrand());
            car.drawVehicle(getRandomX(),getRandomY());
        }
    }

    private static int getRandomX() {
        return (int)(Math.random()*100 );
    }
    private static int getRandomY() {
        return (int)(Math.random()*100);
    }
}

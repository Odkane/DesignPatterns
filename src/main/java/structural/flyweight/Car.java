package structural.flyweight;

public class Car implements Vehicle {
    private final Color color;
    private final Brand brand;

    public Car(Color color, Brand brand){
        this.color = color;
        this.brand=brand;
    }

    @Override
    public void createVehicle() {
        System.out.printf("Creating a %s painted %s Vehicle \n", color.getName(), brand.name());
    }

    @Override
    public void drawVehicle(int x, int y) {
        System.out.printf("Drawing a %s painted %s Vehicle at : x : %d , y : %d \n", color.getName(),brand.name(),x,y);
    }
}
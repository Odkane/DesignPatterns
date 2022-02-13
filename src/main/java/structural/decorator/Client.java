package structural.decorator;

public class Client {

    public static void main(String[] args) {

        IceCream vanillaIceWithCaramel = new CaramelTopping(new VanillaIceCream());

        System.out.printf("This %s costs %s euros%n", vanillaIceWithCaramel.getName(),vanillaIceWithCaramel.getPrice());

        System.out.println("----------------------------");
        IceCream vanillaIceWithStreusel = new StreuselTopping(new VanillaIceCream());

        System.out.printf("This %s costs %s euros%n", vanillaIceWithStreusel.getName(),vanillaIceWithStreusel.getPrice());
    }
}

package structural.proxy;

public class ConcreteWeather implements Weather{

    @Override
    public void whoAmI() {
        System.out.println("\tMethod Call from " +
                this.getClass().getSimpleName() + " class");
        System.out.println("\t\tWeather forecast is sunny\n");
    }
}

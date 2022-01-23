package creational.factory;

public enum PizzaType {
    PEPPERONI, VEGGIE, CHEESE, UNKNOWN;

    public static PizzaType of(String type){
        try{
            return PizzaType.valueOf(type.toUpperCase());
        }
        catch (IllegalArgumentException e){
            return UNKNOWN;
        }
    }
}

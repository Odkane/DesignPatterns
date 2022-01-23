package creational.factory;

public abstract class PizzaFactory {

    public Pizza makePizza(PizzaType type){
        Pizza pizza = createPizza(type);

        pizza.start();
        pizza.addIngredient("tomato");
        pizza.bake();
        pizza.cut();
        pizza.box();
        pizza.delivery();

        return pizza;
    }

    abstract Pizza createPizza(PizzaType type);

}

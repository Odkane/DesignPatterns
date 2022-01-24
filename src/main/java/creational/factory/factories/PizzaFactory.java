package creational.factory.factories;

import creational.factory.Pizza;
import creational.factory.PizzaType;

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

    public abstract Pizza createPizza(PizzaType type);

}

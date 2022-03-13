package creational.factory.factories;

import creational.factory.PizzaType;
import creational.factory.products.Pizza;

public abstract class PizzaFactory {

    public abstract Pizza createPizza(PizzaType type); // getProduct

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

}

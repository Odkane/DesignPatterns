package creational.factory;

import creational.factory.products.NYStyleCheesePizza;
import creational.factory.products.NYStylePepperoniPizza;
import creational.factory.products.NYStyleVeggiePizza;
import creational.factory.factories.NYPizzaFactory;
import creational.factory.factories.PizzaFactory;
import org.junit.jupiter.api.Test;

import static creational.factory.PizzaType.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class NYPizzaFactoryTest {

    @Test
    void createPizzaTest() {
        PizzaFactory factory = new NYPizzaFactory();

        assertThat(factory.createPizza(CHEESE)).isInstanceOf(NYStyleCheesePizza.class);
        assertThat(factory.createPizza(PEPPERONI)).isInstanceOf(NYStylePepperoniPizza.class);
        assertThat(factory.createPizza(VEGGIE)).isInstanceOf(NYStyleVeggiePizza.class);
        assertThatThrownBy(() -> factory.createPizza(PizzaType.UNKNOWN))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Type unknown");

        assertThatThrownBy(() -> factory.createPizza(PizzaType.of("THUNFISCH")))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Type unknown");
    }
}
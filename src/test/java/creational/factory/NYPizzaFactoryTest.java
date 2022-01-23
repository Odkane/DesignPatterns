package creational.factory;

import creational.factory.concreteclasses.NYStyleCheesePizza;
import creational.factory.concreteclasses.NYStylePepperoniPizza;
import creational.factory.concreteclasses.NYStyleVeggiePizza;
import org.junit.jupiter.api.Test;

import static creational.factory.PizzaType.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class NYPizzaFactoryTest {

    @Test
    void createPizzaTest() {
        var nyPizzaFactory = new NYPizzaFactory();

        assertThat(nyPizzaFactory.createPizza(CHEESE)).isInstanceOf(NYStyleCheesePizza.class);
        assertThat(nyPizzaFactory.createPizza(PEPPERONI)).isInstanceOf(NYStylePepperoniPizza.class);
        assertThat(nyPizzaFactory.createPizza(VEGGIE)).isInstanceOf(NYStyleVeggiePizza.class);
        assertThatThrownBy(() -> nyPizzaFactory.createPizza(PizzaType.UNKNOWN))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Type unknown");

        assertThatThrownBy(() -> nyPizzaFactory.createPizza(PizzaType.of("THUNFISCH")))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Type unknown");
    }
}
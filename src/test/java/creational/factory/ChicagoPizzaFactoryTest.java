package creational.factory;

import creational.factory.products.ChicagoStyleCheesePizza;
import creational.factory.products.ChicagoStyleVeggiePizza;
import creational.factory.products.ChicagoSytlePepperoniPizza;
import creational.factory.factories.ChicagoPizzaFactory;
import creational.factory.factories.PizzaFactory;
import org.junit.jupiter.api.Test;

import static creational.factory.PizzaType.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class ChicagoPizzaFactoryTest {

    @Test
    void createPizzaTest() {
        PizzaFactory factory = new ChicagoPizzaFactory();

        assertThat(factory.createPizza(CHEESE)).isInstanceOf(ChicagoStyleCheesePizza.class);
        assertThat(factory.createPizza(PEPPERONI)).isInstanceOf(ChicagoSytlePepperoniPizza.class);
        assertThat(factory.createPizza(VEGGIE)).isInstanceOf(ChicagoStyleVeggiePizza.class);

        assertThatThrownBy(() -> factory.createPizza(PizzaType.UNKNOWN))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Type unknown");

        assertThatThrownBy(() -> factory.createPizza(PizzaType.of("THUNFISCH")))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Type unknown");

    }

}
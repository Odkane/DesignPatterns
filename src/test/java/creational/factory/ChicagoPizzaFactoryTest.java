package creational.factory;

import creational.factory.concreteclasses.ChicagoStyleCheesePizza;
import creational.factory.concreteclasses.ChicagoStyleVeggiePizza;
import creational.factory.concreteclasses.ChicagoSytlePepperoniPizza;
import org.junit.jupiter.api.Test;

import static creational.factory.PizzaType.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class ChicagoPizzaFactoryTest {

    @Test
    void createPizzaTest() {
        var chicagoPizzaFactory = new ChicagoPizzaFactory();

        assertThat(chicagoPizzaFactory.createPizza(CHEESE)).isInstanceOf(ChicagoStyleCheesePizza.class);
        assertThat(chicagoPizzaFactory.createPizza(PEPPERONI)).isInstanceOf(ChicagoSytlePepperoniPizza.class);
        assertThat(chicagoPizzaFactory.createPizza(VEGGIE)).isInstanceOf(ChicagoStyleVeggiePizza.class);

        assertThatThrownBy(() -> chicagoPizzaFactory.createPizza(PizzaType.UNKNOWN))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Type unknown");

        assertThatThrownBy(() -> chicagoPizzaFactory.createPizza(PizzaType.of("THUNFISCH")))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Type unknown");

    }

}
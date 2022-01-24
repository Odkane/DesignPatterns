package creational.factory;

import creational.factory.factories.ChicagoPizzaFactory;
import creational.factory.factories.NYPizzaFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PizzaFactoryProviderTest {

    @Test
    void should_generate_correct_factory_instance() {
        PizzaFactoryProvider factoryProvider = new PizzaFactoryProvider();

        assertThat(factoryProvider.getFactory("New York")).isInstanceOf(NYPizzaFactory.class);
        assertThat(factoryProvider.getFactory("Chicago")).isInstanceOf(ChicagoPizzaFactory.class);

    }
}
package creational.factory;

import creational.factory.concreteclasses.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

import static creational.factory.PizzaType.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class PizzaFactoryTest {

    @ParameterizedTest
    @EnumSource(value = PizzaType.class, names = {"UNKNOWN"}, mode = EnumSource.Mode.EXCLUDE)
    void should_test_make_a_pizza_with_ny_factory(PizzaType type) {
        PizzaFactory factory = Mockito.spy(NYPizzaFactory.class);
        Pizza pizzaMock = Mockito.mock(factory.createPizza(type).getClass());
        when(factory.createPizza(type)).thenReturn(pizzaMock);

        factory.makePizza(type);

        ArgumentCaptor<String> ingredientCaptor = ArgumentCaptor.forClass(String.class);

        verify(pizzaMock).start();
        verify(pizzaMock).addIngredient(ingredientCaptor.capture());

        assertThat(ingredientCaptor.getValue()).isEqualTo("tomato");
        verify(pizzaMock).bake();
        verify(pizzaMock).cut();
        verify(pizzaMock).box();
        verify(pizzaMock).delivery();
    }

    @ParameterizedTest
    @EnumSource(value = PizzaType.class, names = {"UNKNOWN"}, mode = EnumSource.Mode.EXCLUDE)
    void should_test_make_a_pizza_with_chicago_factory(PizzaType type) {
        PizzaFactory factory = Mockito.spy(ChicagoPizzaFactory.class);
        Pizza pizzaMock = Mockito.mock(factory.createPizza(type).getClass());
        when(factory.createPizza(type)).thenReturn(pizzaMock);

        factory.makePizza(type);

        ArgumentCaptor<String> ingredientCaptor = ArgumentCaptor.forClass(String.class);

        verify(pizzaMock).start();

        verify(pizzaMock).addIngredient(ingredientCaptor.capture());
        assertThat(ingredientCaptor.getValue()).isEqualTo("tomato");

        verify(pizzaMock).bake();
        verify(pizzaMock).cut();
        verify(pizzaMock).box();
        verify(pizzaMock).delivery();
    }


    @Test
    void should_test_make_pizza_with_ny_factory(){
        PizzaFactory factory = new NYPizzaFactory();

        assertThat(factory.makePizza(CHEESE)).isInstanceOf(NYStyleCheesePizza.class);
        assertThat(factory.makePizza(PEPPERONI)).isInstanceOf(NYStylePepperoniPizza.class);
        assertThat(factory.makePizza(VEGGIE)).isInstanceOf(NYStyleVeggiePizza.class);

        assertThatThrownBy(() -> factory.makePizza(PizzaType.UNKNOWN))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Type unknown");
    }

    @Test
    void should_test_make_pizza_with_chicago_factory(){
        PizzaFactory factory = new ChicagoPizzaFactory();

        assertThat(factory.makePizza(CHEESE)).isInstanceOf(ChicagoStyleCheesePizza.class);
        assertThat(factory.makePizza(PEPPERONI)).isInstanceOf(ChicagoSytlePepperoniPizza.class);
        assertThat(factory.makePizza(VEGGIE)).isInstanceOf(ChicagoStyleVeggiePizza.class);

        assertThatThrownBy(() -> factory.makePizza(PizzaType.UNKNOWN))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Type unknown");
    }


}
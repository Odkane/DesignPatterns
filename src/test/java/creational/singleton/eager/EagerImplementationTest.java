package creational.singleton.eager;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class EagerImplementationTest {

    @Test
    void check_if_we_get_same_instance() {

        EagerImplementation instance1 = EagerImplementation.getInstance();
        EagerImplementation instance2 = EagerImplementation.getInstance();

        assertThat(instance1).isEqualTo(instance2);
    }
}
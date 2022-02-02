package creational.prototype;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class VehicleTest {

    @Test
    void cloneTest()  {
        Vehicle auto = new ElektroAuto();

        auto.insertVehicle("Tesla S");
        auto.insertVehicle("Audi E-Tron");

        assertThat(auto.getVehicleList()).hasSize(2);

        Vehicle auto2 = (ElektroAuto) auto.getClone();

        auto2.insertVehicle("Cupra Born");
        auto2.insertVehicle("Hyundai Ioniq 5");

        assertThat(auto == auto2).isFalse(); // Because it is not the same Instance(not the same Adresse of the Class), just the same Reference of the fields
        assertThat(auto.getVehicleList()).hasSize(4);
        assertThat(auto2.getVehicleList()).hasSize(4);
    }

    @Test
    void cloneTest_with_reset() {
        Vehicle auto1 = new BenzinAuto();
        Vehicle auto2 = (BenzinAuto) auto1.getClone();

        auto1.insertVehicle("Audi A5");

        assertThat(auto1.getVehicleList()).hasSize(1);
        assertThat(auto2.getVehicleList()).hasSize(1);

        auto2.reset();

        auto2.insertVehicle("BMW 320");
        auto1.insertVehicle("Seat Leon");

        assertThat(auto1.getVehicleList()).hasSize(2);
        assertThat(auto2.getVehicleList()).hasSize(2);
    }
}
package creational.builder.example1;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

class PersonTest {

    @Test
    void should_verify_all_field() {
        Person actual = Person.builder()
                .withFirstName("Mini")
                .withLastName("Maus")
                .withBirthDate(LocalDate.of(1990, 2, 2))
                .build();

        assertThat(actual.getFirstName()).isEqualTo("Mini");
        assertThat(actual.getLastName()).isEqualTo("Maus");
        assertThat(actual.getBirthdate()).isEqualTo(LocalDate.of(1990, 2, 2));
    }

    @Test
    void should_check_person_with_birth_date_not_set() {
        Person actual = Person.builder()
                .withFirstName("Mini")
                .withLastName("Maus")
                .build();

        assertThat(actual.getFirstName()).isEqualTo("Mini");
        assertThat(actual.getLastName()).isEqualTo("Maus");
        assertThat(actual.getBirthdate()).isNull();
    }
}
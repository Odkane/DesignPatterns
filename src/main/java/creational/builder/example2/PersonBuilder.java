package creational.builder.example2;

import java.time.LocalDate;

public interface PersonBuilder {

    PersonBuilder withFirstName(String fName);
    PersonBuilder withLastName(String lName);
    PersonBuilder withBirthDate(LocalDate birth);

    Person build();
}

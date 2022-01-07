package Creational.Builder.firstWay;

import java.time.LocalDate;

public class ConcretePersonBuilder implements PersonBuilder{
    String firstName;
    String lastName;
    LocalDate birthDate;

    @Override
    public PersonBuilder withFirstName(String fName) {
        firstName =fName;
        return this;
    }

    @Override
    public PersonBuilder withLastName(String lName) {
        lastName = lName;
        return this;
    }

    @Override
    public PersonBuilder withBirthDate(LocalDate birth) {
        birthDate = birth;
        return this;
    }

    @Override
    public Person build() {
        return new Person(firstName,lastName,birthDate);
    }
}

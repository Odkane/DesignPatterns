package creational.builder.example2;

import java.time.LocalDate;

public class Person {
    private final String firstName;
    private final String lastName;
    private final LocalDate birthdate;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public Person(String firstName, String lastName, LocalDate birthdate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdate = birthdate;
    }

    public static ConcretePersonBuilder builder(){
        return new ConcretePersonBuilder();
    }
}

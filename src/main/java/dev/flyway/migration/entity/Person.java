package dev.flyway.migration.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Person {
    @Id
    @SequenceGenerator(name="person_generator", sequenceName="person_sequence", allocationSize = 1)
    @GeneratedValue(generator = "person_generator")
    private Long id;
    private String firstName;
    private String lastName;
    private String email;

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastname) {
        this.lastName = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person [firstName=" + this.firstName + ", lastName=" + this.lastName
                + ", email=" + this.email + "]";
    }
}

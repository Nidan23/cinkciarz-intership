package pl.cinkciarz.sulkowski.users.repository;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import pl.cinkciarz.sulkowski.users.datatypes.Address;
import pl.cinkciarz.sulkowski.users.datatypes.Phone;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Setter
@Getter
@Entity
public class User {

    @Id
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;

    @Embedded
    private Address address;

    @Embedded
    private Phone phone;

    public User(){}

    public User(String firstName, String lastName, Address address, Phone phoneNumber){
        this.address = address;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phoneNumber;
    }
}
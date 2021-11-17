package pl.cinkciarz.sulkowski.users.repository;

import org.springframework.data.annotation.Id;
import pl.cinkciarz.sulkowski.users.datatypes.Address;
import pl.cinkciarz.sulkowski.users.datatypes.Phone;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class User {

    @javax.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstName;
    private String lastName;

    @Embedded
    private Address address;

    @Embedded
    private Phone phone;

    public User(){
    }

    public User(String firstName, String lastName, Address address, Phone phoneNumber){
        this.address = address;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phoneNumber;
    }

    public void setId(Long id){
        this.id = id;
    }
    public Long getId(){
        return id;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setAddress(Address address){
        this.address = address;
    }

    public Address getAddress(){
        return address;
    }

    public void setPhoneNumber(Phone phoneNumber){
        this.phone = phoneNumber;
    }

    public Phone getPhoneNumber(){
        return phone;
    }
}
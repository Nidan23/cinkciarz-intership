package pl.cinkciarz.sulkowski.users.datatypes;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;

@Getter
@Setter
@Embeddable
public class Address {
    private String country;
    private String city;
    private String street;

    protected Address() {}

    public Address(String country, String city, String street) {
        this.country = country;
        this.city = city;
        this.street = street;
    }

}

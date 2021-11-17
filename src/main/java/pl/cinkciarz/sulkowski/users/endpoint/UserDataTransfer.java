package pl.cinkciarz.sulkowski.users.endpoint;

import pl.cinkciarz.sulkowski.users.datatypes.Address;
import pl.cinkciarz.sulkowski.users.datatypes.Phone;

public class UserDataTransfer {
    private String firstName;
    private String lastName;

    private String area;
    private String number;

    private String country;
    private String city;
    private String street;

    public UserDataTransfer(String firstName, String lastName, String area, String number, String country, String city, String street) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.area = area;
        this.number = number;
        this.country = country;
        this.city = city;
        this.street = street;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Phone getNumber() {
        return new Phone(area, number);
    }

    public Address getAddress(){
        return new Address(country, city, street);
    }
}

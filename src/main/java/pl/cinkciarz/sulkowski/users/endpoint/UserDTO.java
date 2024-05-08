package pl.cinkciarz.sulkowski.users.endpoint;

import lombok.Getter;
import lombok.Setter;
import pl.cinkciarz.sulkowski.users.datatypes.Address;
import pl.cinkciarz.sulkowski.users.datatypes.Phone;

@Getter
public class UserDTO {
    private final String firstName;
    private final String lastName;
    private final Phone phone;
    private final Address address;

    public UserDTO(String firstName, String lastName, String area, String number, String country, String city, String street) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = new Phone(area, number);
        this.address = new Address(country, city, street);
    }
}

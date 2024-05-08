package pl.cinkciarz.sulkowski.users.datatypes;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;

@Getter
@Setter
@Embeddable
public class Phone {
    private String area;
    private String number;

    protected Phone() {}

    public Phone(String area, String number) {
        this.area = area;
        this.number = number;
    }
}

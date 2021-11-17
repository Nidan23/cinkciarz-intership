package pl.cinkciarz.sulkowski.users.datatypes;

import javax.persistence.Embeddable;

@Embeddable
public class Phone {
    private String area;
    private String number;

    protected Phone() {
    }

    public Phone(String area, String number) {
        this.area = area;
        this.number = number;
    }



    public void setArea(String area) {
        this.area = area;
    }

    public void setNumber(String number) {
        this.number = number;
    }


    public String getNumber() {
        return number;
    }

    public String getArea() {
        return area;
    }

}

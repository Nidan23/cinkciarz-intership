package first.project.uno;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class UserEntity {

    @javax.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstName, lastName, address;

    private Long phoneNumber;

    public UserEntity(){
    }

    public UserEntity(String firstName, String lastName, String address, Long phoneNumber){
        this.address = address;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
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

    public void setAddress(String address){
        this.address = address;
    }

    public String getAddress(){
        return address;
    }

    public void setPhoneNumber(Long phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public Long getPhoneNumber(){
        return phoneNumber;
    }
}

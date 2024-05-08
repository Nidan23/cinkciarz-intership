package pl.cinkciarz.sulkowski.users.service;

import org.springframework.stereotype.Service;
import pl.cinkciarz.sulkowski.users.datatypes.Address;
import pl.cinkciarz.sulkowski.users.datatypes.Phone;
import pl.cinkciarz.sulkowski.users.model.UserDTO;
import pl.cinkciarz.sulkowski.users.repository.User;
import pl.cinkciarz.sulkowski.users.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public void addUser(UserDTO userDTO) {
        String firstName = userDTO.getFirstName();
        String lastName = userDTO.getLastName();
        Phone phone = userDTO.getPhone();
        Address address = userDTO.getAddress();

        User user = new User(firstName, lastName, address, phone);

        this.repository.save(user);
    }

    public void updateUser(UserDTO userDTO, Long id) {
        String firstName = userDTO.getFirstName();
        String lastName = userDTO.getLastName();
        Phone phone = userDTO.getPhone();
        Address address = userDTO.getAddress();

        User user = repository.findById(id).get();

        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setPhone(phone);
        user.setAddress(address);

        repository.save(user);
    }

    public void deleteUser(Long id) {
        this.repository.deleteById(id);
    }

    public List<User> getUsers() {
        return (List<User>) repository.findAll();
    }

    public Optional<User> getUser(Long id) {
        return repository.findById(id);
    }
}
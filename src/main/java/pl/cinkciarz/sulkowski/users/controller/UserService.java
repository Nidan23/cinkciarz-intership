package pl.cinkciarz.sulkowski.users.controller;

import org.springframework.stereotype.Service;
import pl.cinkciarz.sulkowski.users.endpoint.UserDataTransfer;
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

    public void addUser(UserDataTransfer userDataTransfer) {
        User user = new User(userDataTransfer.getFirstName(), userDataTransfer.getLastName(), userDataTransfer.getAddress(), userDataTransfer.getNumber());
        this.repository.save(user);
    }

    public void updateUser(UserDataTransfer userDataTransfer, Long id) {
        User user = repository.findById(id).get();
        user.setFirstName(userDataTransfer.getFirstName());
        user.setLastName(userDataTransfer.getLastName());
        user.setAddress(userDataTransfer.getAddress());
        user.setPhoneNumber(userDataTransfer.getNumber());
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
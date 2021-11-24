package pl.cinkciarz.sulkowski.users.endpoint;

import org.springframework.web.bind.annotation.*;
import pl.cinkciarz.sulkowski.users.controller.UserService;
import pl.cinkciarz.sulkowski.users.repository.User;

import java.util.List;
import java.util.Optional;

@RestController
public class UsersEndpoint {
    private final UserService userService;

    public UsersEndpoint(UserService crud){
        this.userService = crud;
    }

    @PostMapping("/users")
    public String addUser(@RequestBody UserDataTransfer userDataTransfer){
        userService.addUser(userDataTransfer);
        return "\nUser added\n";
    }

    @GetMapping("/users")
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @GetMapping("/users/{id}")
    public Optional<User> getUser(@PathVariable("id") Long id){
        return userService.getUser(id);
    }

    @PatchMapping(path = "/users/{id}", consumes = "application/json")
    public String updateUser(@RequestBody UserDataTransfer userDataTransfer, @PathVariable("id") Long id){
        userService.updateUser(userDataTransfer, id);
        return "\nUser updated\n";
    }

    @DeleteMapping(path = "/users/{id}")
    public String deleteUser(@PathVariable("id") Long id) {
        userService.deleteUser(id);
        return "\nUser deleted\n";
    }

}

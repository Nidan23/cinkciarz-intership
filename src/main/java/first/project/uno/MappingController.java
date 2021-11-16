package first.project.uno;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MappingController {
    private final CrudService crud;

    public MappingController(CrudService crud){
        this.crud = crud;
    }

    @PostMapping("/users")
    public String addUser(@RequestBody UserEntity user){
        crud.addUser(user);
        return "\nUser added\n";
    }

    @GetMapping("/users")
    public List<UserEntity> getUser(){
        return crud.getUser();
    }

    @PatchMapping(path = "/users/{id}", consumes = "application/json")
    public String updateUser(@RequestBody UserEntity user, @PathVariable("id") Long id){
        crud.updateUser(user, id);
        return "\nUser updated\n";
    }

    @DeleteMapping(path = "/users/{id}")
    public String deleteUser(@PathVariable("id") Long id) {
        crud.deleteUser(id);
        return "\nUser deleted\n";
    }

}

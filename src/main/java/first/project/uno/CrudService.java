package first.project.uno;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class CrudService{
    private final UserRepo repo;

    public CrudService(UserRepo repo) {
        this.repo = repo;
    }

    public void addUser(UserEntity user){
        this.repo.save(user);
    }

    public void updateUser(UserEntity user, Long id){
        UserEntity userInstance = repo.findById(id).get();
        repo.deleteById(id);
        userInstance.setFirstName(user.getFirstName());
        userInstance.setLastName(user.getLastName());
        userInstance.setAddress(user.getAddress());
        userInstance.setPhoneNumber(user.getPhoneNumber());
        userInstance.setId(id);
        repo.save(userInstance);
    }

    public void deleteUser(Long id){
        this.repo.deleteById(id);
    }
}

//'{"firstName": "Jakub", "lastName": "Sul", "address": "tak jest", "phoneNumber": 723421}'



//curl -X POST localhost:8080/users -H 'Content-type:application/json' -d '{"firstName": "Jakub", "lastName": "Sul", "address": "tak jest", "phoneNumber": 723421}'
//curl -X DELETE localhost:8080/users/1
//curl -X PATCH localhost:8080/users/2 -d '{"firstName": "Jakub", "lastName": "Sul", "address": "tak jest", "phoneNumber": 723421}'

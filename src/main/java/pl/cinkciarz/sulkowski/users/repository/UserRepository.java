package pl.cinkciarz.sulkowski.users.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.cinkciarz.sulkowski.users.repository.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}

package userManagement;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.LinkedList;
import java.util.List;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

    List<User> findBySurnameContainingOrderByFirstNameAsc(String surname);
    
}

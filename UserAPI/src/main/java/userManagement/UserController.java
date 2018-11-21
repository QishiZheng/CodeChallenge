package userManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserRepo userRepo;

//    @RequestMapping("/")
//    public String index() {
//        return "Hello there, this is the index page";
//    }

    @CrossOrigin
    @GetMapping("/user")
    public List<User> index() {
        return userRepo.findAll();
    }

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable String id) {
        int userId = Integer.parseInt(id);
        return userRepo.findById(userId).get();
    }

    @GetMapping("/user/search/{surname}")
    public List<User> search(@PathVariable("surname") String surname) {
        return userRepo.findBySurnameContainingOrderByFirstNameAsc(surname);
    }

    @PostMapping("/user")
    public ResponseEntity<Object> createUser(@RequestBody User user) {
        User savedUser = userRepo.save(user);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(savedUser.getId()).toUri();

        return ResponseEntity.created(location).build();
    }


}

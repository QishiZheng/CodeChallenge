package userManagement;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);

    }

//    //populate the db with provided user data
//    @Bean
//    public CommandLineRunner demo(UserRepo userRepo) {
//        return (args) -> {
//            // save a couple of customers
//            UserDataReader udr = new UserDataReader("userData.txt");
//            List<User> users = udr.readUserData();
//            for(int i = 0; i < users.size(); ++i) {
//                userRepo.save(users.get(i));
//            }
//        };
//    }
}

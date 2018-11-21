package userManagement;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class UserDataReader {
    String fileName;

    public UserDataReader(String fileName) {
        this.fileName = fileName;
    }


    /**
     * read the given user data files adn return a list of users
     */

    public List<User> readUserData() {
        String s = "";
        List<User> users = new LinkedList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(this.fileName));
            while ((s = br.readLine()) != null) {
                String[] userTokens = s.split(",");
                User newUser = new User(userTokens[0], userTokens[1], userTokens[2], userTokens[3],
                        Integer.parseInt(userTokens[4]));
                users.add(newUser);
            }
            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return users;
    }


}

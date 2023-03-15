package DZ_MOCKITO.DAO;

import DZ_MOCKITO.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserDaoImpl {
    private final List<String> users = new ArrayList<>();

    public UserDaoImpl (User user) {
        users.add("Vasya");
        users.add("Dima");
        users.add("Petya");
    }

    public List<String> getUserByName(String name) {
        if (users.contains(name)) {
            return users;
        }
        return null;
    }

    public List<String> getAllUsers() {
        return Collections.unmodifiableList(users);
    }
}

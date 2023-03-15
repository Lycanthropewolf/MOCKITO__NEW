package DZ_MOCKITO.DAO;

import com.example.srping_mockito_new.DZ_MOCKITO.DAO.UserDaoImpl;
import com.example.srping_mockito_new.DZ_MOCKITO.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class UserDaoImplTest {
    private UserDaoImpl userDao;
    private User user;

    @BeforeEach
    private void setUp() {
        this.userDao = new UserDaoImpl;
    }

    @Test
    public void getUserByName(String name) {

    }

    @Test
    void getAllUsers() {
        User user1=new User("Vasya");
        User user2=new User("Petya");
        User user3=new User("Dima");
        List<User> expected= new ArrayList<>();
        expected.add(user1);
        expected.add(user2);
        expected.add(user3);
        List<User> actual=new ArrayList<>();
        actual.add(user1);
        actual.add(user2);
        actual.add(user3);
        Assertions.assertEquals(expected,actual);
    }
}
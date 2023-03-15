package DZ_MOCKITO.DAO;

import DZ_MOCKITO.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

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
    void findAllUsers() {
    }
}
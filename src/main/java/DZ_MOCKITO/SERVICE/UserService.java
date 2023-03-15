package DZ_MOCKITO.SERVICE;

import DZ_MOCKITO.DAO.UserDaoImpl;
import DZ_MOCKITO.User;

public class UserService {
    private final UserDaoImpl userDao;

    public UserService(UserDaoImpl userDao) {
        this.userDao = userDao;
    }

    public boolean checkUserExist(User user) {
        if (user.getName().contains(userDao.findAllUsers().toString())) {
            return true;
        }
        return false;
    }
}

package DZ_MOCKITO.SERVICE;

import DZ_MOCKITO.DAO.UserDaoImpl;
import DZ_MOCKITO.User;

public class UserService {
    private final UserDaoImpl userDao;

    public UserService(UserDaoImpl userDao) {
        this.userDao = userDao;
    }

    public boolean checkUserExist(User user) {
        if (userDao.getUserByName(user.getName()).contains(user)) {
            return true;
        }
        return false;
    }
}

package com.example.srping_mockito_new.DZ_MOCKITO.SERVICE;

import com.example.srping_mockito_new.DZ_MOCKITO.DAO.UserDaoImpl;
import com.example.srping_mockito_new.DZ_MOCKITO.User;

public class UserService {
    private final UserDaoImpl userDao;

    public UserService(UserDaoImpl userDao) {
        this.userDao = userDao;
    }

    public boolean checkUserExist(User user) {
        if (userDao.getUserByName(user.getName()).contains(userDao)) {
            return true;
        }
        return false;
    }
}

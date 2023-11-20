package com.Services;

import com.Daos.UserDao;
import com.Models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@SuppressWarnings("ALL")
@Service
public class UserService {

    @Autowired
    private final UserDao userDao;

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public int adduser(User user) {
        int add = this.userDao.createUser(user);
        return add;
    }


}

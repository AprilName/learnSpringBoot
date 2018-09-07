package com.xur.service.Impl;

import com.xur.dao.UserDao;
import com.xur.entity.User;
import com.xur.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User getNameById(User user) {
        return userDao.getNameById(user);
    }
}

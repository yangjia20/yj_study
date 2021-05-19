package com.ck.service;

import com.ck.dao.UserDao;
import com.ck.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserserviceImpl implements Userservice {

    @Autowired
    private UserDao userDao;

    public List<User> qureyAll() {
        return userDao.qureyAll();
    }
}

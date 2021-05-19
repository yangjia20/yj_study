package com.ck.service.Impl;

import com.ck.dao.UserDao;
import com.ck.entity.User;
import com.ck.service.UserSvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserSvice {

    @Autowired
    private UserDao userDao;
    @Override
    public List<User> qureyAll() {
        return userDao.qureyAll();
    }
}

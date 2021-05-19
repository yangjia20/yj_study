package com.ck.dao;

import com.ck.entity.User;
import com.ck.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class UserDaoImpl implements UserDao{

    public List<User> qureyall(){
        SqlSession sqlSession = MyBatisUtil.openSession(false);
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        return mapper.qureyall();
    }
}

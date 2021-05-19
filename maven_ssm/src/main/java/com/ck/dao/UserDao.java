package com.ck.dao;

import com.ck.entity.User;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    @Select("select * from users")
    @ResultMap("users")
    public List<User> qureyAll();
}

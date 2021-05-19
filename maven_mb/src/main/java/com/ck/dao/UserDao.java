package com.ck.dao;

import com.ck.entity.User;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import java.util.List;
public interface UserDao {
    //查询所有
    @Select("select * from users")
    @ResultMap("qureyall")
    public List<User> qureyall();
}

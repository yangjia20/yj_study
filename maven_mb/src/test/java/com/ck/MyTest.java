package com.ck;

import com.ck.dao.UserDaoImpl;
import com.ck.entity.User;
import org.junit.Test;


import java.util.List;

public class MyTest {
    @Test
    public void test(){
        List<User> qureyall = new UserDaoImpl().qureyall();
        System.out.println(qureyall);
    }
}

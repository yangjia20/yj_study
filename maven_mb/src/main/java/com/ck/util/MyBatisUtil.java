package com.ck.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class MyBatisUtil {
     private static SqlSessionFactory factory;
    static {
        try {
            String resouce="mybatis-config.xml";
            InputStream resources = Resources.getResourceAsStream(resouce);
            factory = new SqlSessionFactoryBuilder().build(resources);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //定义方法获取操作数据库SqlSession
    //需要事务transactoin传true，否则传false
    public static SqlSession openSession(boolean transaction){
        return factory.openSession(transaction);
    }

}

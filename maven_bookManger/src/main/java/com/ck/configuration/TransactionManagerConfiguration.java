package com.ck.configuration;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 事务配置类
 */
@Configuration
@EnableTransactionManagement//2、注解式事务管理器默认是关闭的，需要通过这个注解开启
public class TransactionManagerConfiguration {

    @Autowired
    private ComboPooledDataSource c3p0;

    // 1、创建事务管理器
    @Bean
    public DataSourceTransactionManager transactionManager(){
        DataSourceTransactionManager ma =
                new DataSourceTransactionManager();
        // 给ma设置数据源
        ma.setDataSource(c3p0);
        return ma;
    }
}

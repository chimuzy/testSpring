package com.zyigeek.d02_prop;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MainTest {
    public static void main(String[] args) throws SQLException {
        //1.创建IOC容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean_prop.xml");

        ComboPooledDataSource dataSource = ac.getBean(ComboPooledDataSource.class);
        System.out.println(dataSource);
        Connection connection=dataSource.getConnection();
        PreparedStatement preparedStatement=connection.prepareStatement("select password from user where username=?");
        preparedStatement.setString(1,"zs");
        ResultSet resultSet=preparedStatement.executeQuery();
        while(resultSet.next()){
            String password=resultSet.getString(1);
            System.out.println(password);
        }
        if(resultSet!=null){
            resultSet.close();
        }
        if(preparedStatement!=null){
            preparedStatement.close();
        }
        if(connection!=null){
            connection.close();
        }
        if(dataSource!=null){
            dataSource.close();
        }
    }
}
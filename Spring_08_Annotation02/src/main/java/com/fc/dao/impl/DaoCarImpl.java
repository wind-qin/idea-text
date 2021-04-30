package com.fc.dao.impl;

import com.fc.bean.Car;
import com.fc.dao.DaoCar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DaoCarImpl implements DaoCar {
//    声明实现类
    @Autowired
    private Car car;
    @Override
    public Car getCar() {

        System.out.println("连接数据库");
        return car;
    }
}

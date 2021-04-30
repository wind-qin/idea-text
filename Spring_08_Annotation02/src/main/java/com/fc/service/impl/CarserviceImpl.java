package com.fc.service.impl;

import com.fc.bean.Car;
import com.fc.dao.DaoCar;
import com.fc.service.Carservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarserviceImpl implements Carservice {
//声明dao层接口实现类
    @Autowired
    private DaoCar daoCar;

//    从dao层获取对象
    @Override
    public Car gerCar() {
        return daoCar.getCar();
    }
}

package com.fc.controller;

import com.fc.bean.Car;
import com.fc.service.Carservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class CarController {

    @Autowired
    private Carservice carservice;

//前往业务层获取car对象
    public Car getCar(){
        return carservice.gerCar();
    }
}

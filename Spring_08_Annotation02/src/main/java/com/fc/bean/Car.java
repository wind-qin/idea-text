package com.fc.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
//相当于声明Spring容器 工厂
@Component
public class Car {
    @Value("拖拉机")
    private String name;
    @Value("红色")
    private String color;
}

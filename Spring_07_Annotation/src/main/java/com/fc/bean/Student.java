package com.fc.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
//// 相当于通过<bean id='student' class='com.fc.bean.Student'/>
@Component
public class Student {
    @Value("天天兄弟")
    private String name;
    @Value("12")
    private Integer age;

}

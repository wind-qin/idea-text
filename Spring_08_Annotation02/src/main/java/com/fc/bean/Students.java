package com.fc.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Students {
    private String name;
    private Integer age;

    public void setName( String name ) {
        this.name = name;
    }

    public void setAge( Integer age ) {
        this.age = age;
    }
}

package com.fc.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String username;
    private String password;
    private Integer age;
    private Date birthday;
    private String gender;
    private String info;


    public User( String username, String password, Integer age, String gender, String info ) {

    }

    public Object setUsername() {
        return null;
    }
}

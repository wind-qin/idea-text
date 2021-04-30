package com.fc.dao;

import com.fc.bean.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserDao {
    List<User> findAll();
}

package com.fc.dao.impl;

import com.fc.bean.users;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class JdbcTemplateDaoImpl {
    private JdbcTemplate jdbcTemplate;

    public void add( String username, String password ) {

//        增
//        准备一个可传参的SQL语句
        int affactedRows = jdbcTemplate.update("insert into users(username,password) value(?,?)", username, password);
//受影响的行数
        System.out.println("受影响的行数" + affactedRows);

    }

    //    删
    public void delete( Integer id ) {
        int affactedRows = jdbcTemplate.update("delete from users where id=?", id);
        System.out.println("受影响的行数" + affactedRows);
    }

    // 改
    public void update( users users ) {
        int affactedRows = jdbcTemplate.update("update users set username=?,password=? where id = ?", users.getId(), users.getPassword(), users.getUsername());

        System.out.println("受影响的行数" + affactedRows);
    }

    // 查
    public void select(Integer id) {
        List<users> list = jdbcTemplate.query("select * from users where id=?", new BeanPropertyRowMapper<>(users.class),id);
        for (users users : list) {
            System.out.println("受影响的行数" + users);
        }

    }

//    查询所有
    public List<users> selectId(){
        return jdbcTemplate.query("select * from users", new BeanPropertyRowMapper<>(users.class));
    }


    public void setJdbcTemplate( JdbcTemplate jdbcTemplate ) {
        this.jdbcTemplate = jdbcTemplate;
    }
}

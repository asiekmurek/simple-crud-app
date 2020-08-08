package com.example.demo;


import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRowMapper implements RowMapper<Users> {

    @Override
    public Users mapRow(ResultSet resultSet, int i) throws SQLException {

        Users users = new Users();
        users.setUserId(resultSet.getString("USER_ID"));
        users.setUserName(resultSet.getString("USER_NAME"));
        users.setUserLstName(resultSet.getString("USER_LST_NAME"));
        users.setAge(resultSet.getLong("AGE"));
        users.setHasAnimal(resultSet.getLong("HAS_ANIMAL"));
        users.setAnimal(resultSet.getString("ANIMAL"));
        return users;
    }
}

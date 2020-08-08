package com.example.demo;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
public class DbConfig {

    @Bean
    public DataSource getDataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.url("jdbc:mysql://remotemysql.com:3306/EPg9MzQD39");
        dataSourceBuilder.username("EPg9MzQD39");
        dataSourceBuilder.password("");  // TODO: change password
        dataSourceBuilder.driverClassName("com.mysql.cj.jdbc.Driver");
        return dataSourceBuilder.build();
    }

    @Bean
    public JdbcTemplate getJdbcTemplate(){
        return new JdbcTemplate(getDataSource());
    }

    @EventListener(ApplicationReadyEvent.class)
    public Users findByUserId(){
        String sql = "SELECT * FROM users where USER_ID = '1'";
        return getJdbcTemplate().queryForObject(sql, new UserRowMapper());
    }

    // TODO: Remove from here, it is only for checking!
    @EventListener(ApplicationReadyEvent.class)
    public void get(){
        System.out.println(findByUserId().getUserName());
    }

}

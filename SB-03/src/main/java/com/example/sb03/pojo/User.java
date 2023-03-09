package com.example.sb03.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

/**
 * @Author: ECRZ
 * Data:2022-01
 * @Description:
 */
@Component
@PropertySource(value = "classpath:user.properties")
@Validated
public class User {
    @Value("1")
    private int id;
    @Value("${user1.name}")
    private String name;
    @Value("#{123123*2}")
    private String pwd;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}

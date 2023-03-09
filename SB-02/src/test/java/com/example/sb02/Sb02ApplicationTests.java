package com.example.sb02;

import com.example.sb02.com.example.sb02.pojo.User;
import com.example.sb02.com.example.sb02.pojo.UserExtends;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Sb02ApplicationTests {

    @Autowired
    UserExtends users;
    @Autowired
    User user;
    @Test
    void contextLoads() {
        System.out.println(user.toString());
        System.out.println(users.toString());
    }

}

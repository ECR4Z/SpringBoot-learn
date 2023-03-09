package com.example.sb03;

import com.example.sb03.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Sb03ApplicationTests {

    @Autowired
    User user;
    @Test
    void contextLoads() {
        System.out.println(user);
    }
}

package com.example.sb04;

import com.example.sb04.poji.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Sb04ApplicationTests {

    @Autowired
    User user;
    @Test
    void contextLoads() {
        System.out.println(user.toString());
    }

}

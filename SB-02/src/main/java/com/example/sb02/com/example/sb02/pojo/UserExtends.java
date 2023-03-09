package com.example.sb02.com.example.sb02.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @Author: ECRZ
 * Data:2021-12
 * @Description:
 */
@Component
@ConfigurationProperties(prefix = "users")
public class UserExtends {
    private int id;
    private String name;
    private Map<String,Object> map;
    private List<Object> list;
    private User user;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "UserExtends{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", map=" + map +
                ", list=" + list +
                ", user=" + user +
                '}';
    }
}

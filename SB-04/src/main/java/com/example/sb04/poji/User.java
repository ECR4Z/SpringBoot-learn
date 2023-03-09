package com.example.sb04.poji;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;


/**
 * @Author: ECRZ
 * Data:2022-01
 * @Description:
 */
@Component
@ConfigurationProperties(prefix = "users")
@Validated
public class User {
    @NotNull
    private String name;

    @NotNull
    private String pwd;

    @Email(message = "邮箱格式错误")
    private String email;

    @AssertTrue
    private boolean sex;

    @Max(value = 120,message = "年龄最大不能超过120")
    private int age;

    @Min(value = 3,message = "工作年限不能低于3年")
    private int work;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWork() {
        return work;
    }

    public void setWork(int work) {
        this.work = work;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", email='" + email + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", work=" + work +
                '}';
    }
}

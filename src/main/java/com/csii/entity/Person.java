package com.csii.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Auther:niulipeng
 * @Date:2021/1/7
 * @Description:com.csii.entity
 * @Version:1.0
 */
@ConfigurationProperties(prefix = "person")
@Component
public class Person {

    private String name;
    private Integer age;
    private List<String> likes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<String> getLikes() {
        return likes;
    }

    public void setLikes(List<String> likes) {
        this.likes = likes;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", likes=" + likes +
                '}';
    }
}

package com.example.demo.bo;

import lombok.Data;

import java.io.Serializable;

/**
 * create by sunzhongwei on 2019/07/16
 * Desc:
 **/
@Data
public class Student implements Serializable {
    Long id;
    String name;
    Integer score;
    public Student(){

    }
    public Student(Long id, String name, Integer score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }
}

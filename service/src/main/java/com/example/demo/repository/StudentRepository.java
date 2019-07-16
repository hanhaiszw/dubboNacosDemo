package com.example.demo.repository;

import com.example.demo.bo.Student;

import java.util.HashMap;
import java.util.Map;

/**
 * create by sunzhongwei on 2019/07/16
 * Desc: 模拟一个数据库操作
 **/

public class StudentRepository {
    private static final Map<Long, Student> STUDENT_DB = new HashMap<Long, Student>() {{
        put(1L, new Student(1L, "小红", 88));
        put(2L, new Student(2L, "小明", 78));
        put(3L, new Student(3L, "小华", 92));
        put(4L, new Student(4L, "小花", 85));
        put(5L, new Student(5L, "小张", 80));
    }};

    public Student getStudentById(Long id) {
        return STUDENT_DB.get(id);
    }
}

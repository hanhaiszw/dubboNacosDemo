package com.example.demo.controller;

import com.example.demo.api.StudentService;
import com.example.demo.bo.Student;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * create by sunzhongwei on 2020/01/11
 * Desc:
 */
@RestController
public class EntryController {

    @Reference(check = false,interfaceClass = StudentService.class,version = "1.0")
    private StudentService studentService;

    @GetMapping("/test")
    public Student getStudent(){
        Student student = studentService.getStudentById(3L);
        System.out.println(student);
        return student;
    }


    @GetMapping("/testById")
    public Student getStudentById(long id){
        Student student = studentService.getStudentById(id);
        System.out.println(student);
        return student;
    }

    @GetMapping("/test1")
    public String getStudent1(){
        return "hello world";
    }
}

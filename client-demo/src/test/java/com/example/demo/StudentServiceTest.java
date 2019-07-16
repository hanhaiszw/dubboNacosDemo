package com.example.demo;

import com.example.demo.api.StudentService;
import com.example.demo.bo.Student;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest(classes = StudentService.class)
@EnableDubbo
@RunWith(SpringRunner.class)
public class StudentServiceTest {
    @Reference(check = false,interfaceClass = StudentService.class,version = "1.0")
    private StudentService studentService;

    @Test
    public void getStudentById(){
        Student student = studentService.getStudentById(3L);
        System.out.println(student);
    }
}
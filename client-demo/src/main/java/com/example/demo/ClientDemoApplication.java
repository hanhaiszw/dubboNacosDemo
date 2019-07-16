package com.example.demo;

import com.example.demo.api.StudentService;

import com.example.demo.bo.Student;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
@EnableDubbo
public class ClientDemoApplication{

    public static void main(String[] args) {
        SpringApplication.run(ClientDemoApplication.class, args);
    }

    @Reference(check = false,interfaceClass = StudentService.class,version = "1.0")
    private StudentService studentService;

    @Bean
    public CommandLineRunner commandLineRunner(){
        return args -> {
            Student student = studentService.getStudentById(2L);
            System.out.println("--------------------szwszwszw--------------------");
            System.out.println(student);
            System.out.println("--------------------szwszwszw--------------------");
        };
    }
}

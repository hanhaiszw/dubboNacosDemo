package com.example.demo.service;


import com.example.demo.api.StudentService;
import com.example.demo.bo.Student;
import com.example.demo.repository.StudentRepository;
import org.apache.dubbo.config.annotation.Service;


/**
 * create by sunzhongwei on 2019/07/16
 * Desc:
 **/
@Service(version = "${demo.service.version}")
@org.springframework.stereotype.Service
public class StudentServiceImpl implements StudentService {
    private StudentRepository studentRepository = new StudentRepository();
    @Override
    public Student getStudentById(Long id) {
        return studentRepository.getStudentById(id);
    }
}

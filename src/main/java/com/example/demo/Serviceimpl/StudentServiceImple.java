package com.example.demo.StudentServiceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Stuentity;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;

@Service
public class StudentServiceImple implements StudentService {
    @Autowired
    StudentRepository studentRepository;

    public Stuentity saveStudent(Stuentity stuentity){
        return studentRepository.save(stuentity);
    }
    
}


package com.example.demo.StudentServiceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Stuentity;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.Studentservice;

@Service
public class StudentServiceImple implements Studentservice {
    @Autowired
    StudentRepository studentRepository;

    public Stuentity saveStudent(Stuentity student){
        return studentRepository.save(student);
    }
    
}
//StudentServiceImple.java
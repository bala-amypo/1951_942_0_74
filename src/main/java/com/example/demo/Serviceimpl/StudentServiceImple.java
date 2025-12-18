package com.example.demo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Stuentity;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;

@Service
public class StudentServiceImple implements StudentService {

    @Autowired
    StudentRepository studentRepository;
    public Stuentity saveStuentity(Stuentity student){
        return studentRepository.save(student);
    }
    public Stuentity saveStudent(Stuentity student){
        return studentRepository.save(student);
    }
}
package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Stuentity;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping("/postdata")
    public Stuentity postdata(@RequestBody Stuentity stuentity){
        return studentService.saveStudent(stuentity);
    }
}

package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Stuentity;
import com.example.demo.service.Studentservice;

@RestController
public class StudentController {
    @Autowired
    Studentservice studentService;

    @PostMapping("/postdata")
    public Stuentity postdata(@RequestBody Stuentity stuentity){
        return studentService.saveStudent(stuentity);
    }
}
//StudentController
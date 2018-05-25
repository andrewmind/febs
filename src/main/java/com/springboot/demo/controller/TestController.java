package com.springboot.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.demo.bean.Student;
import com.springboot.demo.service.StudentService;

@RestController
public class TestController {
    @Autowired
    private StudentService studentService;
    
    @RequestMapping( value = "/querystudent", method = RequestMethod.GET)
    public Student queryStudentBySno(String sno) {
        return this.studentService.queryStudentBySno(sno);
    }
   
    @RequestMapping( value = "/addStudent",method = RequestMethod.GET)
    public int addStudent(Student student) {
		return studentService.add(student);
    	
    }
    @RequestMapping( value = "/queryStudent",method = RequestMethod.GET)
    public Student queryStudent(String sno) {
    	return studentService.queryStudentBySno(sno);
    	
    }
}
package com.springboot.demo.service;

import java.util.List;
import java.util.Map;

import com.springboot.demo.bean.Student;

public interface StudentService {
    int add(Student student);
    int update(Student student);
    int deleteBysno(String sno);
    Student queryStudentBySno(String sno);
    List<Map<String,Object>> getAllStudentFromOracle();
    List<Map<String,Object>> getAllStudentFromMysql();
    List<Map<String, Object>> getAllStudentFromOracleBatis();
    List<Map<String,Object>> getAllStudentFromMysqlBatis();
}
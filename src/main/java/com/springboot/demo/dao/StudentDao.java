package com.springboot.demo.dao;

import java.util.List;
import java.util.Map;

import com.springboot.demo.bean.Student;

public interface StudentDao {

	int add(Student student);

	int update(Student student);

	int deleteBysno(String sno);

	Student queryStudentBySno(String sno);
	
    List<Map<String,Object>> queryStudentsListMap();

	List<Map<String, Object>> getAllStudents();

}

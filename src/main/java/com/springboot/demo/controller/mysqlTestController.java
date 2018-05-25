package com.springboot.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.demo.annotation.Log;
import com.springboot.demo.service.StudentService;

@RestController
public class mysqlTestController {
		
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("queryStudentsFromOracle")
	public List<Map<String,Object>> queryStudentsFromOracle () {
		return this.studentService.getAllStudentFromOracle();
	}
	@RequestMapping("queryStudentsFromMysql")
	public List<Map<String,Object>> queryStudentsFromMysql () {
		return this.studentService.getAllStudentFromMysql();
	}
	@RequestMapping("queryStudentsFromMysqlBatis")
	public List<Map<String,Object>> queryStudentsFromMysqlBatis () {
		return this.studentService.getAllStudentFromMysqlBatis();
	}
	@RequestMapping("queryStudentsFromOracleBatis")
	public List<Map<String,Object>> queryStudentsFromOracleBatis () {
		return this.studentService.getAllStudentFromOracleBatis();
	}
	

    @Log("执行方法一")
    @GetMapping("/one")
    public void methodOne(String name) { }
	
	
	
	
	
	
	

}

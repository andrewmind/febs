package com.springboot.demo.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springboot.demo.bean.Student;

public class StudentMapperT implements RowMapper<Student>{

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student student = new Student();
		student.setSno(rs.getString("sno"));
		student.setName(rs.getString("sname"));
		student.setSex(rs.getString("ssex"));
		return student;
	}
	
	

}

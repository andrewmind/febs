package com.springboot.demo.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MysqlStudentMapper {

	List<Map<String,Object>> getAllStudentsBatis();
	
}

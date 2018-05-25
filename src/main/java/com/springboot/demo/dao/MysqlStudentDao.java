package com.springboot.demo.dao;

import java.util.List;
import java.util.Map;

public interface MysqlStudentDao {
	


	List<Map<String, Object>> getAllStudentsFromMysql();

}

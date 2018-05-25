/*package com.springboot.demo.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springboot.demo.dao.MysqlStudentDao;

@Repository
public class mysqlStudentDaoImpl implements MysqlStudentDao {

	@Autowired
	@Qualifier("mysqlJdbcTemplate")
	private JdbcTemplate JdbcTemplate;
	


	@Override
	public List<Map<String, Object>> getAllStudentsFromMysql() {
		// TODO Auto-generated method stub
		return this.JdbcTemplate.queryForList("select * from student");
	}

}
*/
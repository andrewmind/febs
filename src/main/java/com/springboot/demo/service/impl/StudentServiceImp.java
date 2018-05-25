package com.springboot.demo.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.demo.bean.Student;
import com.springboot.demo.dao.MysqlStudentDao;
import com.springboot.demo.dao.MysqlStudentMapper;
import com.springboot.demo.dao.OracleStudentMapper;
import com.springboot.demo.dao.StudentDao;
import com.springboot.demo.service.StudentService;

@Service("studentService")
public class StudentServiceImp implements StudentService{
//    @Autowired
//    private StudentMapper studentMapper;
    
    @Autowired
    private StudentDao studentDao;
    
    @Autowired
    private MysqlStudentDao msqlStudentDao;
    
    @Autowired
    public MysqlStudentMapper mysqlStudentMapper;
    
    @Autowired
    public OracleStudentMapper oracleStudentMapper;
    
    
    
//    @Override
//    public int add(Student student) {
////        return this.studentMapper.add(student);
//    	return  this.studentDao.add(student);
//    }
    
//    @Override
//    public int update(Student student) {
//        return this.studentMapper.update(student);
//    }
//    
//    @Override
//    public int deleteBysno(String sno) {
//        return this.studentMapper.deleteBysno(sno);
//    }
    
//    @Override
//    public Student queryStudentBySno(String sno) {
//    	return this.studentDao.queryStudentBySno(sno);
////        return this.studentMapper.queryStudentBySno(sno);
//    }
//
	@Override
	public List<Map<String, Object>> getAllStudentFromOracle() {
		return this.studentDao.getAllStudents();
	}
	@Override
	public List<Map<String, Object>> getAllStudentFromMysql() {
		return this.msqlStudentDao.getAllStudentsFromMysql();
	}

	@Override
	public List<Map<String, Object>> getAllStudentFromOracleBatis() {
		return this.oracleStudentMapper.getAllStudentsBatis();
	}

	@Override
	public List<Map<String, Object>> getAllStudentFromMysqlBatis() {
		return this.mysqlStudentMapper.getAllStudentsBatis();
	}

	@Override
	public int update(Student student) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteBysno(String sno) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int add(Student student) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Student queryStudentBySno(String sno) {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public List<Map<String, Object>> getAllStudentFromOracle() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List<Map<String, Object>> getAllStudentFromMysql() {
//		// TODO Auto-generated method stub
//		return null;
//	}
}
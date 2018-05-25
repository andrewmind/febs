package com.springboot.demo.dao;

import org.apache.ibatis.annotations.Mapper;

import com.springboot.demo.bean.SysLog;

@Mapper
public interface SysLogMapper {

	void saveSysLog(SysLog syslog);
}

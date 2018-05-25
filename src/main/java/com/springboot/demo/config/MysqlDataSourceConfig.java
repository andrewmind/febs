package com.springboot.demo.config;

import java.io.IOException;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;

@Configuration
@MapperScan(basePackages=MysqlDataSourceConfig.PACKGE,sqlSessionFactoryRef="mysqlSessionFactory")
public class MysqlDataSourceConfig {
	
	//mysqlDao的扫描路径
	static final String PACKGE =  "com.springboot.demo.dao";
 
	//mybatis mapper 扫描
	static final String MAPPER_LACTION = "classpath:mapper/mysql/*.xml";
	
	@Primary
	@Bean(name="mysqlDataSource")
	@ConfigurationProperties("spring.datasource.druid.mysql")
	public DataSource mysqlDataSource() {
		return DruidDataSourceBuilder.create().build();
	}
	
	
	@Bean(name="mysqlTransactionManager")
	@Primary
	public DataSourceTransactionManager mysqlTransactionManager() {
		return new DataSourceTransactionManager(mysqlDataSource());
	}
	
	@Bean(name="mysqlSessionFactory")
	@Primary
	public SqlSessionFactory mysqlSessionFactory (@Qualifier("mysqlDataSource")DataSource dataSource) throws Exception {
		final SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
		sessionFactoryBean.setDataSource(dataSource);
		sessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(MysqlDataSourceConfig.MAPPER_LACTION));
		return sessionFactoryBean.getObject();
	}
	
}

package com.springboot.demo.config;


import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;

@Configuration
@MapperScan(basePackages=OracleDataSourceConfig.PACKGE,sqlSessionFactoryRef="oracleSessionFactory")
public class OracleDataSourceConfig {
	
	//oracleDao的扫描路径
	static final String PACKGE =  "com.springboot.demo.dao";
 
	//mybatis mapper 扫描
	static final String MAPPER_LACTION = "classpath:mapper/oracle/*.xml";
	
	@Bean(name="oracleDataSource")
	@ConfigurationProperties("spring.datasource.druid.oracle")
	public DataSource oracleDataSource() {
		return DruidDataSourceBuilder.create().build();
	}
	
	
	@Bean(name="oracleTransactionManager")
	public DataSourceTransactionManager oracleTransactionManager() {
		return new DataSourceTransactionManager(oracleDataSource());
	}
	
	@Bean(name="oracleSessionFactory")
	public SqlSessionFactory oracleSessionFactory (@Qualifier("oracleDataSource")DataSource dataSource) throws Exception {
		final SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
		sessionFactoryBean.setDataSource(dataSource);
		sessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(OracleDataSourceConfig.MAPPER_LACTION));
		return sessionFactoryBean.getObject();
	}
	
}

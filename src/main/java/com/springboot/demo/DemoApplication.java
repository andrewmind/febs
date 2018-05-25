package com.springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.demo.bean.ConfigBean;
import com.springboot.demo.bean.TestConfigBean;

@RestController
@SpringBootApplication
//@EnableConfigurationProperties({TestConfigBean.class})
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	
	
}

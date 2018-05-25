package com.springboot.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.demo.bean.ConfigBean;
import com.springboot.demo.bean.TestConfigBean;

@RestController
public class IndexController {
	
//	@Autowired
//	private BlogProperties blogProperties;
//	@Autowired
//	private ConfigBean configBean;
	@Autowired
	private TestConfigBean testConfigBean;
	
	@RequestMapping("/")
	String index() {
//		return blogProperties.getKey() + "--" + blogProperties.getValue();
//		return configBean.getKey() + "--" + configBean.getValue();
		return testConfigBean.getKey() + "--" + testConfigBean.getValue();
	}

}

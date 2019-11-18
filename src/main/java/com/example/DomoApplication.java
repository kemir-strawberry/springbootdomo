package com.example;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
public class DomoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DomoApplication.class, args);
		/*SpringApplication app = new SpringApplication(DomoApplication.class);
		//端口设置（0表示随机端口）
		Map<String,Object> property = new HashMap<String,Object>();
		property.put("server.port", 0);
		app.setDefaultProperties(property);
		
		app.run(args);*/
		
		//new SpringApplicationBuilder(DomoApplication.class).properties("server.port:0").run(args);
		
	}

}

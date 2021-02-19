package com.ntm.boot_mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @MapperScan
 * 扫描mapper
 */
@MapperScan("com.ntm.boot_mybatis.mapper")
/**
 * springboot启动类注解
 */
@SpringBootApplication
/**
 * 项目打成war包添加@ServletComponentScan注解
 * 修改启动类，继承SpringBootServletInitializer
 * 重写configure（），把启动类注册进去
 * return applicationBuilder.sources(DemoApplication.class);
 * 添加<dependency>
 *     <groupId>org.springframework.boot</groupId>
 *     <artifactId>spring-boot-starter-tomcat</artifactId>
 *     <scope>compile</scope>
 * </dependency>
 * 依赖
 * 修改pom.xml文件
 * <packaging>war</packaging>
 * 将默认打包成jar改为war
 */
@ServletComponentScan
@EnableAutoConfiguration
public class DemoApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {

		System.out.println("进入=========》");
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder applicationBuilder){
		return applicationBuilder.sources(DemoApplication.class);
	}

}

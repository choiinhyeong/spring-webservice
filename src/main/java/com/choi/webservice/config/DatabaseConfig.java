package com.choi.webservice.config;

import lombok.RequiredArgsConstructor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@MapperScan(basePackages = "com.choi.webservice.domain.**")
@PropertySource("classpath:application.properties")
@RequiredArgsConstructor
public class DatabaseConfig {

}

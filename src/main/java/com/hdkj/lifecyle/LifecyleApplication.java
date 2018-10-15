package com.hdkj.lifecyle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class LifecyleApplication {

	public static void main(String[] args) {
		SpringApplication.run(LifecyleApplication.class, args);
	}
}

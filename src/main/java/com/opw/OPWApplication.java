package com.opw;

import org.h2.server.web.WebServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OPWApplication {
	public static void main(String[] args) {
		SpringApplication.run(OPWApplication.class, args);
	}
	
}

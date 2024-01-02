package com.codewithkarthik;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.codewithkarthik")
@EnableJpaRepositories("com.codewithkarthik.dao")
@EntityScan("com.codewithkarthik.entity")
public class SampleRestProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleRestProjectApplication.class, args);
	}

}

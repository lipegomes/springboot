package dev.gomes.filipe.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"dev.gomes.filipe.study.SpringStudyJpaApplication"})
public class SpringStudyJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringStudyJpaApplication.class, args);
	}
}

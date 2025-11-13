package br.edu.ifce.hopebox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class HopeboxApplication { 

	public static void main(String[] args) {
		SpringApplication.run(HopeboxApplication.class, args);
	}

}

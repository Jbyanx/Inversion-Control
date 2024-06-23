package com.bycompany;

import com.bycompany.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringIocApplication {
	@Autowired
	private ProductService productService;

	public static void main(String[] args) {
		SpringApplication.run(SpringIocApplication.class, args);

	}

	@Bean
	public CommandLineRunner comandoUtilizanoAutowired(){
		return (args) -> {
			productService.save("moto boxer");
			productService.remove("moto honda navi");
		};
	}
}

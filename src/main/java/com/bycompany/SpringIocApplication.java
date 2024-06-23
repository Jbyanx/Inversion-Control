package com.bycompany;

import com.bycompany.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringIocApplication implements CommandLineRunner {
	@Autowired
	private ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringIocApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("hola desde command line runner");
	}

	@Bean
	public CommandLineRunner comandoLambda(){
		return (args) -> {
			System.out.println("hola desde command line runner pero con una expresion LAMBDA");
		};
	}

	@Bean
	public CommandLineRunner comandoUtilizanoAutowired(){
		return (args) -> {
			productRepository.save("mouse gamer");
			productRepository.remove("teclado azul");
		};
	}
}

package com.bycompany;

import com.bycompany.service.ProductService;
import com.bycompany.service.ShoppingCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class SpringIocApplication {
	@Autowired
	private ProductService productService;
	@Autowired
	private ShoppingCarService shoppingCarService;

	public static void main(String[] args) {
		SpringApplication.run(SpringIocApplication.class, args);

	}

	@RequestMapping("/example")
	public String example(){
		productService.save("honda xre");
		return "Hello Springboot IOC";
	}

	@RequestMapping("/add-product")
	public String addProduct(){
		shoppingCarService.add();
		return "producto agregado";
	}

	@RequestMapping("/get-products")
	public List<String> getProducts(){
		return shoppingCarService.getProductos();
	}

	@Bean
	public CommandLineRunner comandoUtilizanoAutowired(){
		return (args) -> {
			//productService.save("moto boxer");
			//productService.remove("moto honda navi");
		};
	}

}

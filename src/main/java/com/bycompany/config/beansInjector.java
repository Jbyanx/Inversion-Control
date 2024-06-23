package com.bycompany.config;

import com.bycompany.repository.ProductRepository;
import com.bycompany.repository.ProductRepositoryA;
import com.bycompany.repository.ProductRepositoryB;
import com.bycompany.service.ProductService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class beansInjector {

    public beansInjector() {
        System.out.println("creando instancia de "+ this.getClass().getSimpleName());
    }

    @Bean
    public ProductRepositoryA createProductRepositoryA(){
        return new ProductRepositoryA();
    }

    @Bean
    public ProductRepositoryB createproductRepositoryB(){
        return new ProductRepositoryB();
    }

    @Bean
    public ProductService createProductService(){
        return new ProductService();
    }

}

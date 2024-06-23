package com.bycompany.repository.config;

import com.bycompany.repository.ProductRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class beansInjector {

    public beansInjector() {
        System.out.println("creando instancia de "+ this.getClass().getSimpleName());
    }

    @Bean
    public ProductRepository createProductRepository(){
        return new ProductRepository();
    }
}

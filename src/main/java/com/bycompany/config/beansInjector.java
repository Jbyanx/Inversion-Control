package com.bycompany.config;

import com.bycompany.repository.ProductRepository;
import com.bycompany.repository.ProductRepositoryA;
import com.bycompany.repository.ProductRepositoryB;
import com.bycompany.service.ProductService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class beansInjector {

    public beansInjector() {
        System.out.println("creando instancia de " + this.getClass().getSimpleName());
    }

    @Bean("productRepositoryXML")
    public ProductRepositoryA createProductRepositoryA(){
        return new ProductRepositoryA();
    }

    @Bean("productRepositoryMySQL")
    //@Primary
    public ProductRepositoryB createproductRepositoryB(){
        return new ProductRepositoryB();
    }

    @Bean
    public ProductService createProductService(){
        return new ProductService();
    }

}

package com.bycompany.config;

import com.bycompany.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class HttpClientConfig {


//    @Bean
//    public RestTemplate restTemplate(@Qualifier("productMySQL") ProductRepository productRepository){
//        System.out.println("bean con restTemplate");
//        productRepository.save("camisa verde");
//        return new RestTemplate();
//    }
}

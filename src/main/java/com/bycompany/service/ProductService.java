package com.bycompany.service;

import com.bycompany.repository.ProductRepository;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

@Service
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ProductService {
    private ProductRepository productRepository;

    @PostConstruct
    public void postConstruct(){
        System.out.println("=====>Creando instancia de "+this.getClass().getSimpleName());
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("=====>Destruyendo instancia de "+this.getClass().getSimpleName());
    }

    public void save(String name){
        productRepository.save(name);
    }
    public void remove(String name){
        productRepository.remove(name);
    }

    @Autowired
    public void setProductRepository(@Qualifier("productMySQL") ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
}

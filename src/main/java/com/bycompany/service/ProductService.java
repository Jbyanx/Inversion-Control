package com.bycompany.service;

import com.bycompany.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class ProductService {
    @Qualifier("productRepositoryMySQL")
    @Autowired
    private ProductRepository productRepository;

    public ProductService() {
        System.out.println("creando instancia de "+ this.getClass().getSimpleName());
    }
    public void save(String name){
        productRepository.save(name);
    }
    public void remove(String name){
        productRepository.remove(name);
    }
}

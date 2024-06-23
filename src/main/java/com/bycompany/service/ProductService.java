package com.bycompany.service;

import com.bycompany.repository.ProductRepositoryA;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductService {
    @Autowired
    private ProductRepositoryA productRepositoryA;

    public ProductService() {
        System.out.println("creando instancia de "+ this.getClass().getSimpleName());
    }
    public void save(String name){
        productRepositoryA.save(name);
    }
    public void remove(String name){
        productRepositoryA.remove(name);
    }
}

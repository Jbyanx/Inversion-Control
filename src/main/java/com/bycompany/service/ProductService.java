package com.bycompany.service;

import com.bycompany.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private ProductRepository productRepository;

    public void save(String name){
        productRepository.save(name);
    }
    public void remove(String name){
        productRepository.remove(name);
    }

    @Autowired
    @Qualifier("productXML")
    public void setProductRepository(ProductRepository productRepository) {//la interfaz
        this.productRepository = productRepository;
    }
}

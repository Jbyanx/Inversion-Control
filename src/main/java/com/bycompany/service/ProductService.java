package com.bycompany.service;

import com.bycompany.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    @Qualifier("productXML")
    private ProductRepository productRepository;

    public void save(String name){
        productRepository.save(name);
    }
    public void remove(String name){
        productRepository.remove(name);
    }
}

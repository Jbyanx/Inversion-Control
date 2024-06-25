package com.bycompany.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ShoppingCarService {
    private final List<String> productos = new ArrayList<>();
    private Integer counter = 0;

    @PostConstruct
    public void postConstruct(){
        System.out.println("Creando instancia de "+this.getClass().getSimpleName());
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("Creando instancia de "+this.getClass().getSimpleName());
    }

    public void add(){
        counter++;
        productos.add(counter.toString() + " -- Microfono");
    }

    public List<String> getProductos() {
        return productos;
    }
}

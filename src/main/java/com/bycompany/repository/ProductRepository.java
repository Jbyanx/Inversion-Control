package com.bycompany.repository;

public class ProductRepository {

    public void save(String name){
        System.out.println("Producto guardado exitosamente: "+name);
    }

    public void remove(String name){
        System.out.println("Producto eliminado exitosamente: "+name);
    }
}

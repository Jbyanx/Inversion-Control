package com.bycompany.repository;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("productMySQL")
@Primary
public class ProductRepositoryA implements ProductRepository{
    @Value("${jabes.borre} -> se puede concatenar en la anotacion #{1+1} -> #{@componentB.getClassName()}")
    private String mensaje;

    @PostConstruct
    public void postConstruct(){
        System.out.println("=====>Creando instancia de "+this.getClass().getSimpleName());
        System.out.println("mensaje desde application.properties: " + mensaje);
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("=====>Destruyendo instancia de "+this.getClass().getSimpleName());
    }

    public void save(String name){
        System.out.println("==SAVE: "+this.getClass().getSimpleName());
        System.out.println("Producto guardado exitosamente: "+name);
    }

    public void remove(String name){
        System.out.println("==REMOVE: "+this.getClass().getSimpleName());
        System.out.println("Producto eliminado exitosamente: "+name);
    }
}

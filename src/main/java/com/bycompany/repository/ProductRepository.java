package com.bycompany.repository;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


public interface ProductRepository {
    void save(String name);

    void remove(String name);
}

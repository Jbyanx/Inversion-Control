package com.bycompany.circular.dependencies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComponentB {
    @Autowired
    private ComponentC componentC;

    public String getClassName(){
        return "yo soy el bean "+this.getClass().getSimpleName();
    }
}

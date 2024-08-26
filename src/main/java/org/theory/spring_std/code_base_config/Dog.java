package org.theory.spring_std.code_base_config;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Component;


@Getter
@AllArgsConstructor
public class Dog {

    private String name;
    private long age;
    private double weight;

    @PostConstruct
    private void inti() {
        age = 1;
        name = "Fluffy";
        weight = 3.23;
        System.out.println("Init Fluffy.");
    }

    @PreDestroy
    private void destroy() {
        System.out.println("Destroy dog =(");
    }
}

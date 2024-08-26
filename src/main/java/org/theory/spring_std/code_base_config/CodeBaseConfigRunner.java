package org.theory.spring_std.code_base_config;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CodeBaseConfigRunner {
    public static void main(String[] args) {
        try (var context = new ClassPathXmlApplicationContext("codeBaseConfigApplication.xml")) {
            var dog = context.getBean(Dog.class);
            System.out.println(dog.getName());
        }
    }
}

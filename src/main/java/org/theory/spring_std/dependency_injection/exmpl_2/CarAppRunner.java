package org.theory.spring_std.dependency_injection.exmpl_2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.naming.Context;

public class CarAppRunner {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("application.xml");
        var car = context.getBean("Corolla-1");
        System.out.println(car);
        var carRep = context.getBean("CarRep-1");
        System.out.println(carRep);
}

}

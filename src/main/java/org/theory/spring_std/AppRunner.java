package org.theory.spring_std;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppRunner {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("application.xml");

//        System.out.println(context.getBean(ConnectionPool.class));
        ConnectionPool pool2 = context.getBean("pool2", ConnectionPool.class);
        System.out.println(pool2);

        var driver = context.getBean("driver", String.class);
        System.out.println(driver);


    }
}

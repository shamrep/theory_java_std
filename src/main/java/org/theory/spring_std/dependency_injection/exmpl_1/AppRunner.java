package org.theory.spring_std.dependency_injection.exmpl_1;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.theory.spring_std.dependency_injection.exmpl_1.repository.CompanyRepository;

public class AppRunner {
    public static void main(String[] args) {

        try (var context = new ClassPathXmlApplicationContext("application.xml")) {

//          System.out.println(context.getBean(ConnectionPool.class));
            ConnectionPool pool2 = context.getBean("pool2", ConnectionPool.class);
            System.out.println(pool2);

            var driver = context.getBean("driver", String.class);
            System.out.println(driver);

            CompanyRepository companyRepository = context.getBean("companyRepository", CompanyRepository.class);
            System.out.println(companyRepository);
        }
    }
}

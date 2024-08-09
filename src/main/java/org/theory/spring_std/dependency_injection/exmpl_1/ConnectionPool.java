package org.theory.spring_std.dependency_injection.exmpl_1;

import org.springframework.beans.factory.InitializingBean;

import java.util.List;
import java.util.Map;

public class ConnectionPool implements InitializingBean {
    private final String name;
    private final Integer poolSize;
    private final List<Object> objects;
    private Map<String, Object> properties;

    public ConnectionPool(String name,
                          Integer poolSize,
                          List<Object> objects,
                          Map<String, Object> properties) {
        this.name = name;
        this.poolSize = poolSize;
        this.objects = objects;
        this.properties = properties;
    }

    public void setProperties(Map<String, Object> properties) {
        this.properties = properties;
    }

    private void init() {
        System.out.println("Init connection pool");
    }

    private void destroy() {
        System.out.println("Clean connection pool");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Properties set");
    }
}

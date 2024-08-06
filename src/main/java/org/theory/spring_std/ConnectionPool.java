package org.theory.spring_std;

import java.util.List;
import java.util.Map;

public class ConnectionPool {
    private final String name;
    private final Integer poolSize;
    private final List<Object> objects;
    private final Map<String, Object> properties;

    public ConnectionPool(String name,
                          Integer poolSize,
                          List<Object> objects,
                          Map<String, Object> properties) {
        this.name = name;
        this.poolSize = poolSize;
        this.objects = objects;
        this.properties = properties;
    }
}

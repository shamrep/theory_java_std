package org.theory.spring_std.dependency_injection.exmpl_2;

public class ConnectionPool {
    private final int size;

    public ConnectionPool(int size) {
        this.size = size;
    }
}

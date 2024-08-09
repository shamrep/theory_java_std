package org.theory.spring_std.dependency_injection.exmpl_1.repository;

import org.theory.spring_std.dependency_injection.exmpl_1.ConnectionPool;

public class CompanyRepository {
    private final ConnectionPool connectionPool;

    private CompanyRepository(ConnectionPool connectionPool) {
        this.connectionPool = connectionPool;
    }

    public static CompanyRepository of(ConnectionPool connectionPool) {
        return new CompanyRepository(connectionPool);
    }
}

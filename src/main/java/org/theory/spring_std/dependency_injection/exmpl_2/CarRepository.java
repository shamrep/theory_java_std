package org.theory.spring_std.dependency_injection.exmpl_2;

public class CarRepository {
    private final ConnectionPool pool;

    public CarRepository(ConnectionPool pool) {
        this.pool = pool;
    }

    public static CarRepository of(ConnectionPool connectionPool) {
        return new CarRepository(connectionPool);
    }
}

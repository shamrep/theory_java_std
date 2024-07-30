package org.theory.concurrency.classes;

import java.util.Random;
import java.util.stream.IntStream;

public class ThreadLocalTest {
    public static void main(String[] args) {
        ThreadLocal<String> threadLocal = new ThreadLocal<>();

        Random random = new Random();

        IntStream.range(1, 10).forEach(i -> new Thread(() -> {
            threadLocal.set(i + " " + random.nextInt(100));
            System.out.println("Thread number and its local value  " + threadLocal.get());
        }).start());
    }
}

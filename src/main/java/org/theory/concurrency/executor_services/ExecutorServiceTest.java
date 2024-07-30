package org.theory.concurrency.executor_services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceTest {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 5; i++) {
//            executorService.
            executorService.execute(
                    () -> {
                        List<Integer> list = new ArrayList<>();
                        for (int j = 0; j < 5; j++) {
                            list.add(j);
                            System.out.println(Thread.currentThread().getName() + "  " + j);
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                        }
//                        return list;
                    });
        }
        executorService.shutdown();
    }
}

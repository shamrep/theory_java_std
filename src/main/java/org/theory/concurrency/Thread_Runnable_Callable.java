package org.theory.concurrency;

import java.util.List;
import java.util.concurrent.*;
import java.util.stream.IntStream;

public class Thread_Runnable_Callable {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            IntStream.rangeClosed(1, 10).forEach(System.out::println);
        });

        Thread2 thread2 = new Thread2();

        thread1.start();
        thread2.start();

        Callable callable = () -> IntStream.rangeClosed(20, 30).boxed().toList();

        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<List<String>> future = executorService.submit(callable);

        try {
            List<String> strings = future.get();
            System.out.println(strings);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        } finally {
            executorService.shutdown();
        }
    }

    static class Thread2 extends Thread {
        @Override
        public void run() {
            IntStream.rangeClosed(10, 20).forEach(System.out::println);
        }
    }
}

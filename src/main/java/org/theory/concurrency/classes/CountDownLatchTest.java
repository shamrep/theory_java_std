package org.theory.concurrency.classes;

import java.util.concurrent.CountDownLatch;
import java.util.stream.IntStream;

public class CountDownLatchTest {
    static class Testing implements Runnable {
        private CountDownLatch countDownLatch;

        public Testing(CountDownLatch countDownLatch) {
            this.countDownLatch = countDownLatch;
        }

        @Override
        public void run() {
            System.out.println("student is solving a test");
            countDownLatch.countDown();
            System.out.println("student went home");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(10);

        IntStream.rangeClosed(1,10).forEach(i -> new Thread(new Testing(countDownLatch)).start());
        countDownLatch.await();
        System.out.println("everyone is ready, testing is over.");
    }


}

package org.theory.concurrency;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.stream.IntStream;

public class CyclicBarrierTest {
    static class Worker implements Runnable {

        @Override
        public void run() {
            System.out.println("clear");
            System.out.println("coat with glue");
            System.out.println("paste together");
        }
    }

    static class CyclicBarrierWorker implements Runnable {
        CyclicBarrier cyclicBarrier;

        public CyclicBarrierWorker(CyclicBarrier cyclicBarrier) {
            this.cyclicBarrier = cyclicBarrier;
        }

        @Override
        public void run() {

            try {
                System.out.println("clear");
                cyclicBarrier.await();
                System.out.println("coat with glue");
                cyclicBarrier.await();
                System.out.println("paste together");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (BrokenBarrierException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        CyclicBarrier barrier = new java.util.concurrent.CyclicBarrier(10);
        IntStream.rangeClosed(1, 10).forEach(value -> new Thread(new Worker()).start());
        IntStream.rangeClosed(1, 10).forEach(i -> new Thread(new CyclicBarrierWorker(barrier)).start());
    }
}

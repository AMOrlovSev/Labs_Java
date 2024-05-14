package lab13;

import java.util.concurrent.CountDownLatch;

class Ex02_CountThread implements Runnable {

    Counter counter;
    CountDownLatch latch;

    Ex02_CountThread(Counter counter, CountDownLatch latch) {
        this.counter = counter;
        this.latch = latch;
    }

    @Override
    public void run() {
        synchronized (counter) {
            for (int i = 1; i <= 1000; i++) {
//                System.out.println(Thread.currentThread().getName() + " Iteration: " + i);
                counter.increment();
                latch.countDown();
            }
//            System.out.println(counter.getCount());
        }
    }
}

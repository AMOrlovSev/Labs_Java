package lab13;

import java.util.concurrent.CountDownLatch;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

//        //Ex01
        for(int i=1; i <= 10; i++){
            Ex01_MyThread myThread = new Ex01_MyThread("Thread: "+i);
            myThread.start();
        }

        //Ex02
        int n = 100;
        Counter counter = new Counter();
        CountDownLatch latch = new CountDownLatch(n);

        for (int i = 1; i <= n; i++) {
            Thread t = new Thread(new Ex02_CountThread(counter, latch));
            t.start();
        }
        System.out.println(counter.getCount() + "*****");
        try {
            latch.await();
            System.out.println(counter.getCount() + "!!!!");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(counter.getCount() + "&&&&&");

        //Ex03
        Counter counter2 = new Counter();
        Ex03_MyThread t1 = new Ex03_MyThread(counter2);
        Ex03_MyThread t2 = new Ex03_MyThread(counter2);
        t1.start();
        t2.start();

//        //test
//        CountDownLatch countDownLatch=new CountDownLatch(10);
//        for (int i = 0; i <10; i++) {
//            Thread t = new Thread(new TestAndGo(countDownLatch));
//            t.start();
//        }
//
////        IntStream.range(0,10).forEach((i)->
////                new Thread(new TestAndGo(countDownLatch)).start());
//
//        try {
//            countDownLatch.await();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println("все сдали, зачет окончен");

    }
}


////test
//class TestAndGo implements Runnable {
//    private CountDownLatch countDownLatch;
//
//    public TestAndGo(CountDownLatch countDownLatch) {
//        this.countDownLatch = countDownLatch;
//    }
//
//    @Override
//    public void run() {
//        System.out.println("в процессе тестирования");
//        countDownLatch.countDown();
//        System.out.println("пошел домой");
////        countDownLatch.countDown();
//    }
//}
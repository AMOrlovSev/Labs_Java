package lab13;

public class Main {
    public static void main(String[] args) {

        //Ex01
        for(int i=1; i <= 10; i++){
            Ex01_MyThread myThread = new Ex01_MyThread("Thread: "+i);
            myThread.start();
        }

        //Ex02
        Counter counter = new Counter();
        for (int i = 1; i <= 100; i++) {
            Thread t = new Thread(new CountThread(counter));
            t.start();
        }

        //не разобрался как проверить что те потоки завершились или как синхронизировать
        try {
            Thread.sleep(2000);
            System.out.println(counter.getCount());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //Ex03
        Counter counter2 = new Counter();

        Ex03_MyThread t1 = new Ex03_MyThread(counter2);
        Ex03_MyThread t2 = new Ex03_MyThread(counter2);
        t1.start();
        t2.start();

    }
}


//Ex02
class Counter {
    int count = 0;

    public void increment() {
        count = count + 1;
    }

    public int getCount() {
        return count;
    }
}

class CountThread implements Runnable {

    Counter counter;

    CountThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        synchronized (counter) {
            for (int i = 1; i <= 1000; i++) {
//                System.out.println(Thread.currentThread().getName() + " Iteration: " + i);
                counter.increment();
            }
//            System.out.println(counter.getCount());
        }
    }
}

//Ex03
class Ex03_MyThread extends Thread {
    Counter counter;

    public Ex03_MyThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (counter) {
                try {
                    System.out.println(Thread.currentThread().getName());
                    counter.notify();
                    counter.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}



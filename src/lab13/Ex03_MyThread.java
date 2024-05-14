package lab13;

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

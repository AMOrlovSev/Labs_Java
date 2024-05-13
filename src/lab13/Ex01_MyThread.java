package lab13;

class Ex01_MyThread extends Thread {

    Ex01_MyThread(String name){
        super(name);
    }

    public void run(){

        System.out.printf("%s started... \n", Thread.currentThread().getName());


        for (int i = 0; i<=100; i++){
            System.out.println(Thread.currentThread().getName() + " Iteration: " + i);
        }

        System.out.printf("%s fiished... \n", Thread.currentThread().getName());
    }
}

package Multithreading; 

public class Main {

    public static void main(String[] args) {
        
        // first way to create thread
        MyThread thread1 = new MyThread();

        // second way to create thread
        MyRunnable runnable1 = new MyRunnable();
        Thread thread2 = new Thread(runnable1);

        thread1.start();
        thread2.start();

        // break main thread
        System.out.println(1/0);
    }

}

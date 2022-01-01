package Multithreading; 

public class Main {

    public static void main(String[] args) {
        
        // first way to create thread // extends thread class
        MyThread thread1 = new MyThread();

        // second way to create thread // implements runnable
        MyRunnable runnable1 = new MyRunnable();
        Thread thread2 = new Thread(runnable1);

        thread1.start();

        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread2.start();

        // break main thread
        // System.out.println(1/0);
    }

}

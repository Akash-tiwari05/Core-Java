package MultiThreading;

import java.sql.SQLOutput;

class MyRunnable implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i < 30; i++) {
            System.out.println("Runnable ......");
        }
    }
}


public class RunnableTest {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();

        Thread t = new Thread(myRunnable);
        t.start();
        for(int i = 0; i < 30; i++) {
            System.out.println("Main Thread...");
        }
    }
}

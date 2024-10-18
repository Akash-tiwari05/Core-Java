package MultiThreading;

class ThreadTest extends Thread{
    @Override
    public void run() {
        for(int i = 0; i < 5; i++){
           // System.out.println(Thread.currentThread());
            System.out.println("Child Thread Executing ....");
        } 
    }
}
public class ThreadDemo {
    public static void main(String[] args) {
        ThreadTest threadTest = new ThreadTest();
        threadTest.start();//most important topic
        for (int i = 0; i < 5; i++){
          // System.out.println(Thread.currentThread());
            System.out.println("Main Thread......");
        }
    }
}

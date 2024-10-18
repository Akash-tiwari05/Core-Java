package MultiThreading;

class YieldTest implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++){
            System.out.println(Thread.currentThread().getName() +": "+ i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            Thread.yield();
            //System.out.println("Yield thread...");
        }
    }
}

public class YieldDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(new YieldTest());
        t1.start();
        for (int i = 0; i < 5; i++){
            System.out.println(Thread.currentThread().getName());
            System.out.println("Main thread...");
        }
    }
}

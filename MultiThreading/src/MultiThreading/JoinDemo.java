package MultiThreading;

class JoinTest implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                 
            }
        }
    }
}


public class JoinDemo {
    public static void main(String[] args) throws InterruptedException {
       Thread t1 = new Thread(new JoinTest(), "JoinTest");
       t1.start();
       t1.join(2000,1);
        System.out.println("Main Thread");
    }
}

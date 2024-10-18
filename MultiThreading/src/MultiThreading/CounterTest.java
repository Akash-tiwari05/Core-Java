package MultiThreading;

class Counter{
    private int count = 0;
    public synchronized void increment(){
        count++;
    }

    public int getCount() {
        return count;
    }
}
class CounterThread extends Thread{
    private  Counter counter;
    CounterThread(Counter counter){
        this.counter = counter;
    }

    @Override
    public void run() {
        super.run();
        for (int i= 0; i < 10; i++){
            counter.increment();
        }
    }
}

public class CounterTest {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread t1 = new CounterThread(counter);
        Thread t2 = new CounterThread(counter);
        t1.start();
        t2.start();
    }


}

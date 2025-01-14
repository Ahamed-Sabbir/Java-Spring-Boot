package raceCondition;

public class RunnableClass implements Runnable{
    private Integer num = 10;
//    private AtomicInteger num = new AtomicInteger(10);

    @Override
    public void run() {
        for(int i = 0; i < 100000; i++) {
            increment();
        }
    }

//    synchronized public void increment(){
//        num++;
//    }

    synchronized public void increment(){
        synchronized (this){
            num++;
        }
    }

    public Integer getNum(){
        return num;
    }
}

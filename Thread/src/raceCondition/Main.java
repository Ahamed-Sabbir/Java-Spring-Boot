package raceCondition;
public class Main {
    public static void main(String[] args) {
        RunnableClass runnable = new RunnableClass();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException ex){
            System.out.println(ex.getMessage());
        }
        // it will provide wrong value. to prevent this we need synchronization
        System.out.println(runnable.getNum());
    }
}

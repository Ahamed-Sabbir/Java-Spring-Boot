package basics;

public class Main {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        ThreadExtendingThreadClass thread1 = new ThreadExtendingThreadClass();
        thread1.start();

        ThreadExtendingThreadClass thread2 = new ThreadExtendingThreadClass();
        thread2.start();

        // they will make main thread wait until these two thread are done
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException ex){
            System.out.println(ex.getMessage());
        }
        long endTime = System.currentTimeMillis();
        System.out.println("total time take : " + (endTime-startTime+1));


        ThreadImplementingRunnableInterface runnable = new ThreadImplementingRunnableInterface();
        Thread thread3 = new Thread(runnable);
        Thread thread4 = new Thread(runnable);
        thread3.start();
        thread4.start();
    }
}
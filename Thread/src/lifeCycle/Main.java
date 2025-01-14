package lifeCycle;

public class Main {
    public static void main(String[] args) {
        ThreadImplementingRunnable runnable = new ThreadImplementingRunnable();
        Thread thread1 = new Thread(runnable);
        System.out.println(thread1.getState());
        thread1.start();
        System.out.println(thread1.getState());

        try{
            Thread.sleep(1000);
        } catch (InterruptedException ex){
            System.out.println(ex.getMessage());
        }

        System.out.println(thread1.getState());

        try{
            Thread.sleep(1000);
        } catch (InterruptedException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println(thread1.getState());

    }
}
package lifeCycle;

public class ThreadImplementingRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread implementing runnable interface");
        printNumbers();
    }

    public void printNumbers(){
        for(int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
        try{
            Thread.sleep(1000);
        } catch (InterruptedException ex){
            System.out.println(ex.getMessage());
        }
        for(int i=6;i<=10;i++){
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}

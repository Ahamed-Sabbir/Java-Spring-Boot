package basics;

public class ThreadImplementingRunnableInterface implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread implementing runnable interface");
        printNumbers();
    }

    public void printNumbers(){
        for(int i=1;i<=10;i++){
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}

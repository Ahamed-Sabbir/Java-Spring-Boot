package basics;
public class ThreadExtendingThreadClass extends Thread{
    @Override
    public void run() {
        System.out.println("Thread extending thread class");
        printNumbers();
    }
    public void printNumbers(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex){
            System.out.println(ex.getMessage());
        }
        for(int i=1;i<=10;i++){
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}

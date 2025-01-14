package executorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) {

        // single thread
        // ExecutorService executorService = Executors.newSingleThreadExecutor();

        // thread pool --> we can specify number of thread
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        UserInformation userInformation1 = new UserInformation();
        UserInformation userInformation2 = new UserInformation();
        UserInformation userInformation3 = new UserInformation();


        // what is future? --> when I'm creating a thread when will it finish do you know? Because
        // many other threads are running at the same time.
        // what if we write --> String name = executorService.submit(userInformation1);
        //                      sout(name);
        // now as it is multiThreaded, userInformation1 thread will be running and at the same time
        // main thread will come to sout(name); here. what will it get? nothing.
        Future<String> CallableReturn =  executorService.submit(userInformation1);

        String name = null;
        try {
            // it will make wait the main thread until it get the returned value from callable
            name = CallableReturn.get();
        } catch (InterruptedException | ExecutionException ex){
            System.out.println(ex.getMessage());
        }

        System.out.println(name);

        // executorService.submit(userInformation2);
        // executorService.submit(userInformation3);
    }
}

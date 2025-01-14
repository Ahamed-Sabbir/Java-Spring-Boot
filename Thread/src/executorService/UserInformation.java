package executorService;
import java.util.concurrent.Callable;
public class UserInformation implements Callable<String> {
    @Override
    public String call()  {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
        return "Sabbir";
    }
}

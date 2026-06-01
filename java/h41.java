import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class h41 {

    public static void main(String[] args)
            throws Exception {

        ExecutorService service =
                Executors.newFixedThreadPool(3);

        Callable<Integer> task1 = () -> 10;
        Callable<Integer> task2 = () -> 20;
        Callable<Integer> task3 = () -> 30;

        Future<Integer> f1 = service.submit(task1);
        Future<Integer> f2 = service.submit(task2);
        Future<Integer> f3 = service.submit(task3);

        System.out.println("Result 1 = " + f1.get());
        System.out.println("Result 2 = " + f2.get());
        System.out.println("Result 3 = " + f3.get());

        service.shutdown();
    }
}
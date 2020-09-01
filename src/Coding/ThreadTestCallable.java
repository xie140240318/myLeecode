package Coding;

import java.util.concurrent.*;

public class ThreadTestCallable implements Callable<String> {

    @Override
    public String call() throws Exception {
        return Thread.currentThread().getName().toString();
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ThreadTestCallable threadTestCallable = new ThreadTestCallable();

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Future<String> sub1 = executorService.submit(threadTestCallable);
        Future<String> sub2 = executorService.submit(threadTestCallable);
        Future<String> sub3 = executorService.submit(threadTestCallable);
        String s = sub1.get();
        String s = sub1.get();

        
    }
}

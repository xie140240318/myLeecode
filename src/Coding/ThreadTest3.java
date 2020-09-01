package Coding;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadTest3 implements Runnable{
    private int currTicket=100;
    @Override
    public void run() {
        while(true){
            if(currTicket>0){
                System.out.println(Thread.currentThread().getName()+"拿到了第"+currTicket+"票");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                currTicket--;
            }
        }
    }

    public static void main(String[] args) {
        ThreadTest3 t1=new ThreadTest3();


        new Thread(t1).start();
        new Thread(t1).start();
        new Thread(t1).start();

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Future<?> sub1 = executorService.submit(t1);
        


    }
}

package Coding;

public class ThreadTest2 implements Runnable {

    @Override
    public void run() {
        for(int i=0;i<2000;i++){
            System.out.println("线程到了+"+i);
        }
    }

    public static void main(String[] args) {
        ThreadTest2 threadTest2=new ThreadTest2();
        Thread thread=new Thread(threadTest2);
        thread.start();


        for(int i=0;i<2000;i++){
            System.out.println("main线程到了+"+i);
        }
    }
}

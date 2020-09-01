package Coding;

public class ThreadTest1 extends Thread{
    @Override
    public void run() {
        for(int i=0;i<1000;i++){
            System.out.println("分线程+"+i);

        }
    }

    public static void main(String[] args) {
        ThreadTest1 threadTest1=new ThreadTest1();
        threadTest1.start();

        for(int i=0;i<1000;i++){
            System.out.println("main+"+i);

        }
    }

}



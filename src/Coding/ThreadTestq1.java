package Coding;

class RunnableTest implements Runnable {
    private int i ;
    @Override
    public void run() {
        for(;i<50;i++){
            System.out.println(Thread.currentThread().getName() + " -- " + i);
        }
    }
    public static void main(String[] args) {
        for(int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName() + " -- " + i);
            if(i==20){
                RunnableTest runnableTest = new RunnableTest() ;
                new Thread(runnableTest,"线程1").start() ;
                new Thread(runnableTest,"线程2").start() ;
            }
        }
    }
}

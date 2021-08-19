package singletonDemo;

/*
    懒汉式（同步方法，线程安全）
    解决上面普通的懒汉式实现方式的线程不安全问题，对getInstance()方法进行了线程同步。
    缺点是效率较低，每个线程在想获得类的实例时候，执行getInstance()方法都要进行同步，影响性能。
 */
public class Singleton02 {
    private static Singleton02 singleton;

    private Singleton02() {
    }

    //synchronized关键字，将getInstance()设置为同步方法
    public static synchronized Singleton02 getInstance() {
        if (singleton == null) {
            singleton = new Singleton02();
        }
        return singleton;
    }
}

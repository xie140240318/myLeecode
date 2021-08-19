package singletonDemo;

/*
    懒汉式最简单的实现方式，实现了Lazy Loading的效果，但是只能在单线程下使用，面临线程不安全的问题。
    如果在多线程下，一个线程进入了if (singleton == null)判断语句块，还未来得及往下执行，另一个线程也通过了这个判断语句，这时便会产生多个实例。所以在多线程环境下不可使用这种方式。
 */
public class Singleton01 {
    private static Singleton01 singleton;

    private Singleton01() {
    }

    public static Singleton01 getInstance() {
        //同时多个线程进入判断语句，会产生多个实例
        if (singleton == null) {
            singleton = new Singleton01();
        }
        return singleton;
    }
}

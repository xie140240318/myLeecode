package singletonDemo;

/*
    饿汉式（静态常量，线程安全）
    在类装载的时候就完成实例化，避免了线程同步问题。
    这种实现，在类装载的时候就完成实例化，没有达到Lazy Loading的效果。如果从始至终从未使用过这个实例，则会造成内存的浪费。
 */
public class Singleton03 {
    private final static Singleton03 INSTANCE = new Singleton03();

    private Singleton03() {
    }

    public static Singleton03 getInstance() {
        return INSTANCE;
    }
}

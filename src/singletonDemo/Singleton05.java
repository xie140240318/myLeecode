package singletonDemo;

/*
    双重检查（Double-Check）利用两层if(singleton == null)检查，同时保证了实例化对象唯一性和线程安全。

    这样，实例化代码只用执行一次，后面再次访问时，判断if (singleton == null)，直接return实例化对象。
 */
public class Singleton05 {
    private static volatile Singleton05 singleton;

    private Singleton05() {}

    public static Singleton05 getInstance() {
        if (singleton == null) {
            synchronized (Singleton05.class) {
                if (singleton == null) {
                    singleton = new Singleton05();
                }
            }
        }
        return singleton;
    }
}

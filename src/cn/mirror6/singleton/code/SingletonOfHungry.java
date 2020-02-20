package cn.mirror6.singleton.code;

/**
 * @author mirror6
 * @description 单例模式 饿汉式 demo 线程安全
 * @date 2019/7/25 11:05
 */
public class SingletonOfHungry {

    private static SingletonOfHungry singletonOfHungry = new SingletonOfHungry();

    private SingletonOfHungry() {
    }

    public static SingletonOfHungry getSingleton() {
        return singletonOfHungry;
    }
}

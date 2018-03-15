package MySingleton05;

/**
 * Created by bentengdi on 2018/3/15.
 */
public class MySingleton {
    /**
     * 懒汉式单例-双检查锁机制-线程安全
     * 这里在声明变量时使用了volatile关键字来保证其线程间的可见性；在同步代码块中使用二次检查，
     * 以保证其不被重复实例化。集合其二者，这种实现方式既保证了其高效性，也保证了其线程安全性。
     */

    //使用volatile关键字保其可见性
    volatile private static MySingleton instance = null;

    private MySingleton() {
    }

    public static MySingleton getInstance() {
        try {
            if (instance != null) {//懒汉式

            } else {
                //创建实例之前可能会有一些准备性的耗时工作
                Thread.sleep(300);
                synchronized (MySingleton.class) {
                    if (instance == null) {//二次检查
                        instance = new MySingleton();
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return instance;
    }
}

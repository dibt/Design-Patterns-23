package mysingleton;

/**
 * Created by bentengdi on 2018/3/15.
 */
public class MySingleton4 {
    /*懒汉式单例-同步代码块-线程安全-效率低*/
    private static MySingleton4 instance = null;

    private MySingleton4() {
    }

    public static MySingleton4 getInstance() {
        try {
            synchronized (MySingleton4.class) {
                if (instance != null) {//懒汉式

                } else {
                    //创建实例之前可能会有一些准备性的耗时工作
                    Thread.sleep(300);
                    instance = new MySingleton4();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return instance;
    }

//    /*懒汉式单例-同步部分代码块-非线程安全-效率低*/
//    private static MySingleton3 instance = null;
//
//    private MySingleton3() {
//    }
//
//    public static MySingleton3 getInstance() {
//        try {
//                if (instance != null) {//懒汉式
//
//                } else {
//                    //创建实例之前可能会有一些准备性的耗时工作
//                    Thread.sleep(300);
//                    synchronized (MySingleton3.class) {
//                    instance = new MySingleton3();
//                }
//            }
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        return instance;
//    }
}

package MySingleton02;

/**
 * Created by bentengdi on 2018/3/15.
 */
public class MySingleton {
    /*懒汉式单例-非线程安全*/
    private static MySingleton instance = null;
    private MySingleton(){}
    public static MySingleton getInstance() {
        try {
            if(instance != null){//懒汉式

            }else{
                //创建实例之前可能会有一些准备性的耗时工作
                Thread.sleep(300);
                instance = new MySingleton();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return instance;
    }
//    public static MySingleton getInstance() {
//        if(instance == null){//懒汉式
//            instance = new MySingleton();
//        }
//        return instance;
//    }
}

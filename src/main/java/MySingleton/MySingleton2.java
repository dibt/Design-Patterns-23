package MySingleton;

/**
 * Created by bentengdi on 2018/3/15.
 */
public class MySingleton2 {
    /*懒汉式单例-非线程安全*/
    private static MySingleton2 instance = null;
    private MySingleton2(){}
    public static MySingleton2 getInstance() {
        try {
            if(instance != null){//懒汉式

            }else{
                //创建实例之前可能会有一些准备性的耗时工作
                Thread.sleep(300);
                instance = new MySingleton2();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return instance;
    }
}

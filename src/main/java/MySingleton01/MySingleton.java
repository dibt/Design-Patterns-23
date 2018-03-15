package MySingleton01;

/**
 * Created by bentengdi on 2018/3/15.
 */
public class MySingleton {
    /*饿汉式单例-线程安全*/
    private static MySingleton mySingleton = new MySingleton();
    private MySingleton(){}
    public static MySingleton getInstance(){
        return mySingleton;
    }
}

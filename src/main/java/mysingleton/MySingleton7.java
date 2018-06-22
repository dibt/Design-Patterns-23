package mysingleton;

/**
 * Created by bentengdi on 2018/3/15.
 */
public class MySingleton7 {
    /*static代码块实现单例-线程安全*/
    private static MySingleton7 instance = null;

    private MySingleton7(){}

    static{
        instance = new MySingleton7();
    }

    public static MySingleton7 getInstance() {
        return instance;
    }
}

package MySingleton07;

/**
 * Created by bentengdi on 2018/3/15.
 */
public class MySingleton {
    /*static代码块实现单例-线程安全*/
    private static MySingleton instance = null;

    private MySingleton(){}

    static{
        instance = new MySingleton();
    }

    public static MySingleton getInstance() {
        return instance;
    }
}

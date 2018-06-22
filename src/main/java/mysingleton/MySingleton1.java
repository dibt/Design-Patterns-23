package mysingleton;

/**
 * Created by bentengdi on 2018/3/15.
 */
public class MySingleton1 {
    /*饿汉式单例-线程安全*/
    private static MySingleton1 mySingleton1 = new MySingleton1();
    private MySingleton1(){}
    public static MySingleton1 getInstance(){
        return mySingleton1;
    }
}

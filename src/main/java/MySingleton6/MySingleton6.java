package MySingleton6;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * Created by bentengdi on 2018/3/15.
 */
public class MySingleton6 implements Serializable {
    /**
     * 静态内部类实现单例-线程安全
     * 静态内部类虽然保证了单例在多线程并发下的线程安全性，
     * 但是在遇到序列化对象时，默认的方式运行得到的结果却是多例的。
     */
    private MySingleton6() {
    }

    private static class MySingletonHandler {//静态内部类
        private static MySingleton6 instance = new MySingleton6();
    }

    public static MySingleton6 getInstance() {
        return MySingletonHandler.instance;
    }
    //该方法在反序列化时会被调用
    protected Object readResolve() throws ObjectStreamException {
        System.out.println("调用了readResolve方法！");
        return MySingletonHandler.instance;
        //return new String("返回了一个全新的class");
    }
}

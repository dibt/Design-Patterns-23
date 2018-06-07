package MySingleton;

/**
 * Created by bentengdi on 2018/3/15.
 */
public class MySingleton6 {
    /**
     *
     * 静态内部类实现单例-线程安全
     *
     */
    private MySingleton6() {
    }

    private static class MySingletonHandler {//静态内部类
        private static MySingleton6 instance = new MySingleton6();
    }

    public static MySingleton6 getInstance() {
        return MySingletonHandler.instance;
    }
}

package dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

 public class JDKDynamicProxy implements InvocationHandler {
    // 　这个就是我们要代理的真实对象
    private Object subject;

    // 构造方法，给我们要代理的真实对象赋初值
    public JDKDynamicProxy(Object subject) {
        this.subject = subject;
    }
    /**
     *
     * @param obj 目标类的实例
     * @param method 目标方法的反射对象
     * @param args 方法的参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object obj, Method method, Object[] args) throws Throwable {
        System.out.println("开始打印日志");
        // 当代理对象调用真实对象的方法时，其会自动的跳转到代理对象关联的handler对象的invoke方法来进行调用
        method.invoke(subject,args);
        System.out.println("结束打印日志");
        return null;
    }
}

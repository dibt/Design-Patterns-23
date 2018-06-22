# 动态代理模式的-DynamicProxy
AOP的源码中用到了两种动态代理来实现拦截切入功能：jdk动态代理和cglib动态代理。  
两种方法同时存在，各有优劣。  
jdk动态代理是由Java内部的反射机制来实现的，  
cglib动态代理底层则是借助ASM（ASM 是一个 Java 字节码操控框架）来实现的。  
还有一点必须注意：jdk动态代理的应用前提，必须是目标类基于统一的接口。  
spring两种代理方式：  
若目标对象实现了若干接口，spring使用JDK的java.lang.reflect.Proxy类代理。   
优点：因为有接口，所以使系统更加松耦合   
缺点：为每一个目标类创建接口  
若目标对象没有实现任何接口，spring使用CGLIB库生成目标对象的子类。   
优点：因为代理类与目标类是继承关系，所以不需要有接口的存在。   
缺点：因为没有使用接口，所以系统的耦合性没有使用JDK的动态代理好。  
* 基于JDK动态代理  
要创建一个动态代理，只需要利用Java API提供的两个类：  
java.lang.reflect.InvocationHandler： 这是调用处理器接口，它自定义了一个 invoke() 方法，就是在这个方法里触发代理对象自己的方法，为我们可以在它的前后增加我们自己的增强方法。
java.lang.reflect.Proxy： 这是 Java 动态代理机制的主类，它提供了一组静态方法来为一组接口，动态地生成代理类及其对象，也就是动态生成代理对象的方法。  
当调用Proxy.newProxyInstance()方法时，必须要传入一个InvocationHandler接口的实现。所有对动态代理对象的方法调用都会被转向到InvocationHandler接口的实现上  
每一个动态代理类都必须要实现InvocationHandler这个接口，并且每个代理类的实例都关联到了一个handler，当我们通过代理对象调用一个方法的时候，这个方法的调用就会被转发为由InvocationHandler这个接口的 invoke 方法来进行调用。

* 基于CGLIB的动态代理

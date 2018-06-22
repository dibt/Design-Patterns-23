# 高并发下线程安全的单例模式-singleton
* [MySingleton1][url1]

  [url1]:https://github.com/dibt/Design-Patterns-23/tree/master/src/main/java/mysingleton/MySingleton1.java  
  饿汉式单例-线程安全
* [MySingleton2][url2]

  [url2]:https://github.com/dibt/Design-Patterns-23/tree/master/src/main/java/mysingleton/MySingleton2.java  

  懒汉式单例-非线程安全
* [MySingleton3][url3]

  [url3]:https://github.com/dibt/Design-Patterns-23/tree/master/src/main/java/mysingleton/MySingleton3.java    

  懒汉式单例-synchronized关键字-同步方法-线程安全-效率低
* [MySingleton4][url4]

  [url4]: https://github.com/dibt/Design-Patterns-23/tree/master/src/main/java/mysingleton/MySingleton4.java 

  懒汉式单例-synchronized关键字-同步代码块-线程安全-效率低，
  其中还有一种情况不是线程安全的，代码中注释掉的部分，原因是
  同步部分代码块。
 * [MySingleton5][url5]
 
   [url5]:https://github.com/dibt/Design-Patterns-23/tree/master/src/main/java/mysingleton/MySingleton5.java
 
   懒汉式单例-双检查锁机制-线程安全  
   
   在声明变量时使用了volatile关键字来保证其线程间的可见性；
   在同步代码块中使用二次检查，以保证其不被重复实例化。
   集合其二者，这种实现方式既保证了其高效性，也保证了其线程安全性。  
  * [mysingleton6][url6]
  
    [url6]:https://github.com/dibt/Design-Patterns-23/tree/master/src/main/java/mysingleton/MySingleton6.java   
  
    静态内部类实现单例-线程安全  
  
    拓展：  
  静态内部类虽然保证了单例在多线程并发下的线程安全性，
  但是在遇到序列化对象时(就是实现Serializable接口)，默认的方式运行得到的结果却是多个实例的。
  ObjectInputStream类中的readObject()方法返回的是一个新的被序列化的实例，
  要保证其线程安全，需要实现单例的类中实现一个readResolve()方法，
  具体实现见MySingleton6包中[mysingleton6][url66]下的实现。
  
    [url66]:https://github.com/dibt/Design-Patterns-23/tree/master/src/main/java/mysingleton6/MySingleton6.java
    简单介绍一下readResolve()方法：  
    
    保护性恢复对象（同时也可以替换对象）——readResolve()：
  
      * readResolve()会在readObject()调用之后自动调用，
      它最主要的目的就是让恢复的对象变个样，比如readObject()
      已经反序列化好了一个MySingleton6对象，那么就可以在
      readResolve()里再对该对象进行一定的修改，而最终修改
      后的结果将作为ObjectInputStream的readObject()的返回结果；
  
      * 原型：任意访问限定符 Object readResolve() throws ObjectStreamException;
  
      * 该方法起到的作用：
  
           i. 调用该方法之前会先调用readObject()反序列化得到
           对象；
  
           ii. 接着，如果该方法存在则会自动调用该方法；
  
           iii. 在该方法中可以正常通过this访问到刚才反序列化
           得到的对象的内容；
  
           iv. 然后可以根据这些内容进行一定处理返回一个对象；
  
           vi. 该对象将作为ObjectInputStream的readObject()的返回值（即该对象将作为对象输入流的最终输入）；
  
    你可以返回一个非原类型的对象，也就是说可以彻底替换对象，比如
    代码中//return new String("返回了一个全新的class");其实
    反序列化时无谓的替换很无聊的。  
    
    [JAVA对象流序列化时的readObject，writeObject，readResolve是怎么被调用的][url]
    
    [url]: https://blog.csdn.net/u014653197/article/details/78114041
  * [MySingleton7][url7] 
  
    [url7]:https://github.com/dibt/Design-Patterns-23/tree/master/src/main/java/mysingleton/MySingleton7.java
    static代码块实现单例-线程安全
  * [ClassFactory][url8]
  
    [url8]:https://github.com/dibt/Design-Patterns-23/tree/master/src/main/java/mysingleton/ClassFactory.java
    使用enum枚举实现单例模式

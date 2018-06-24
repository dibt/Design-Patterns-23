package com.di.mysingleton;

/**
 * Created by bentengdi on 2018/3/15.
 */
public class MyThread implements Runnable {
    @Override
    public void run(){
//        System.out.println(MySingleton1.getInstance().hashCode());
//        System.out.println(MySingleton2.getInstance().hashCode());
//        System.out.println(MySingleton3.getInstance().hashCode());
//        System.out.println(MySingleton4.getInstance().hashCode());
//        System.out.println(MySingleton5.getInstance().hashCode());
//        System.out.println(com.di.mysingleton6.getInstance().hashCode());
//        System.out.println(MySingleton7.getInstance().hashCode());
        System.out.println(ClassFactory.getInstance().hashCode());
    }

    public static void main(String[] args) {
        Thread[] mts = new Thread[10];
        for(int i = 0 ; i < mts.length ; i++){
            mts[i] = new Thread(new MyThread());
        }
        for (int j = 0; j < mts.length; j++) {
            mts[j].start();
        }
    }

}

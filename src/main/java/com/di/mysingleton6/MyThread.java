package com.di.mysingleton6;


/**
 * Created by bentengdi on 2018/3/15.
 */
public class MyThread implements Runnable {
    @Override
    public void run(){
        System.out.println(MySingleton6.getInstance().hashCode());
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

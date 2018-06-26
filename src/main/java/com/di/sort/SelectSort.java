package com.di.sort;

/**
 * Created by bentengdi on 2018/5/30.
 */
public class SelectSort implements ISort {

    @Override
    public void sort(int[] array) {
        int flag;
        for(int i =0 ;i<array.length-1;i++){
            flag=i;
            for(int j =i+1;j<array.length;j++){
                if(array[flag] > array[j]){
                   flag=j;
                }
            }
            if(i != flag){
              int temp = array[i];
              array[i] =array[flag];
              array[flag] = temp;
            }
        }
    }
}

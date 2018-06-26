package com.di.sort;

/**
 * Created by bentengdi on 2018/5/30.
 */
public class BubbleSort implements ISort {
    @Override
    public void sort(int[] array){
        for(int i=0;i<array.length;i++){
            for(int j=0;j< array.length-1-i;j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

    }
}

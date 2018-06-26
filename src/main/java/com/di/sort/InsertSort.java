package com.di.sort;

/**
 * Created by bentengdi on 2018/5/30.
 */
public class InsertSort implements ISort {
    @Override
    public void sort(int[] array){
        int j,temp;
        for(int i = 1;i<array.length;i++){
             temp = array[i];
            for( j=i;j>0 && array[j-1]>temp;j--){
                array[j] = array[j-1];
            }
            array[j] = temp;
        }
    }
}

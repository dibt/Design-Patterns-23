package com.di.sort;

public class SortTest {
    public static void main(String[] args){
        //ISort sort = new SelectSort();
        //ISort sort = new InsertSort();
        //ISort sort = new BubbleSort();
        ISort sort = new QuickSort();
        int[] array = {0,4,8,9,7,8,2,5,0};
        sort.sort(array);
        for(int i = 0 ;i< array.length; i++){
            System.out.print(array[i]);
        }
        System.out.println();
    }
}

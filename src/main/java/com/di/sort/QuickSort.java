package com.di.sort;

public class QuickSort implements ISort {
    @Override
    public void sort(int[] array) {
        quickSort(array,0,array.length-1);
    }
    public void quickSort(int[] array,int left,int right){
        while(left<right){
            int index = array[left];
            int i = left;
            int j = right;
            while (i<j){
                while(i < j && array[j] >= index)
                    j--;
                if(i < j)
                    array[i++] = array[j];
                while(i < j && array[i] < index)
                    i++;
                if(i < j)
                    array[j--] = array[i];
                array[i] = index;
            }
            quickSort(array,left,i-1);
            quickSort(array,i+1,right);
        }
    }
}

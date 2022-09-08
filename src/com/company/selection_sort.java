package com.company;

import java.util.Arrays;

import static java.lang.Math.max;

public class selection_sort {
    public static void main(String[] args) {
        int [] array = {3,2,4,1,5};
        System.out.println(Arrays.toString(selection_sort(array)));

    }
    static int [] selection_sort(int [] array){
        for (int j = 0; j < array.length; j++) {
            int end = array.length-j-1;
            int k =  maximum(array,0,end);
            swapping(array,k,end);

        }
        return array;
    }
    static  int  maximum(int [] array,int start ,int end ){
        int maxi = start;
        for (int i = start;i <=end;i++){
            if (array[maxi]<array[i]){
                maxi = i;
            }

        }
        return maxi;
    }
    static void swapping(int [] array,int element1,int element2){
        int temp = array[element1];
        array[element1] =array[element2];
        array[element2]=temp;

    }


}

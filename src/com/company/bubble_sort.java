package com.company;

import java.util.Arrays;

public class bubble_sort {
    public static void main(String[] args) {
        int []array = {1,6,9,4,5};
        System.out.println(Arrays.toString(bubble_sort(array)));

    }
    static int [] bubble_sort(int [] array){

        for (int i = 0;i <array.length;i++){
            int sampled = 0;
            for(int j =1;j<array.length-i;j++){

                if (array[j]<array[j-1]){
                    int temp =array[j-1] ;
                    array[j-1] = array[j];
                    array[j]=temp;
                    sampled++;
                }

            }
            if (sampled==0){
                break;
            }

        }
        return  array;
    }
    static int [] insertion_sort(int [] array){
        int n = array.length;
        for (int i = 0; i <=n-2; i++) {
            for (int j = i+1; j>0; j--) {
                if (array[j]<array[j-1]){
                    swapping(array, j ,j-1);

                }
                else {
                    break;
                }

            }
        }
        return array;
    }
    static void swapping(int [] array,int element1,int element2){
        int temp = array[element1];
        array[element1] =array[element2];
        array[element2]=temp;

    }



}

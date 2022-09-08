package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class binary_search_2Darray {
    public static void main(String[] args) {
        int [][] array ={ {10,20,30,40},{15,25,35,45},{28,29,37,49},{33,34,38,50}};
        System.out.println(Arrays.toString(binary_2D(array,49)));
    }
    static int[] binary_2D(int [][]array , int target){
        int rows =0;
        int coloumns = array[0].length-1;
        while (rows<array.length && coloumns>0){
            if (target == array[rows][coloumns]){
                return new int[]{rows, coloumns};
            }
            else if (target<array[rows][coloumns]){
                coloumns-=1;

            }
            else if(target>array[rows][coloumns]){
                rows+=1;
            }
        }
        return new int[]{-1, -1};
    }

}

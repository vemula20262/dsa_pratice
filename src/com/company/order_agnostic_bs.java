package com.company;

public class order_agnostic_bs {
    public static void main(String[] args) {
        int array [] ={5,4,2,1};
        int target  = 4;
        int length = array.length;
        if (array[0]<array[length-1]){
            System.out.println(acending_search(array,target));

        }
        else {
            System.out.println(decending_search(array,target));

        }
    }
    static int acending_search(int array[],int target){
        int start = 0;
        int end = array.length-1;
        int mid = 0;
        while (start<end){
            mid = (end +start)/2;
            if (target <array[mid]){
                end = mid-1;
            }
            else if (target>array[mid]){
                start =mid+1;

            }
            else if(target==array[mid]){
                return mid;
            }
        }
        return -1;
    }
    static int decending_search(int array[],int target ){
        int start = 0;
        int end = array.length-1;
        int mid = 0;
        while (start<end){
            mid = (end +start)/2;
            if (target <array[mid]){
                start =mid+1;
            }
            else if (target>array[mid]){
                end = mid-1;


            }
            else if(target==array[mid]){
                return mid;
            }
        }
        return -1;
    }

}

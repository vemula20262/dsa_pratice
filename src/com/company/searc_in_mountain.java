package com.company;

public class searc_in_mountain {
    public static void main(String[] args) {

    }
    static int search(int []array , int target ){
        int peak = peak(array);
        int a =ascending_search(array,target,0,peak);
        int b = decending_search(array,target,peak,array.length);
        if (a != -1){
            return a;
        }
        else {
            return b;
        }

    }


    static  int peak (int [] array ){

        int start = 0;
        int end = array.length-1;

        while (start < end ){
            int mid = start +(end -start)/2;
            if (array[mid]<array[mid+1]){
                start = mid +1;
            }
            else if (array[mid]>array[mid+1]){

                end = mid;
            }

        }

        return start;
    }
    static int ascending_search(int [] array,int target,int start ,int end){
        int mid = 0;
        while (start<=end){
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
    static int decending_search(int array[],int target,int start ,int end ){
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

package com.company;

public class mounain_array {
    public static void main(String[] args) {
        int [] array = {0,1,0};
        System.out.println(search(array));
    }
    static  int search (int [] array ){

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
}

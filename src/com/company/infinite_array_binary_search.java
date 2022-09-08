package com.company;

public class infinite_array_binary_search {
    public static void main(String[] args) {

        int [ ]array = {3,5,7,9,10,90,100,130,140,160,170};
        int target = 10;
        System.out.println(search (array,target));
    }
    static int search(int [] array ,int target){
        int start = 0;
        int end = 1;
        while (true){
            if (target > array[end]){
                int  newstart = end + 1;
                end = end + (end-start)*2;
                start = newstart;
            }
            else {
                break;
            }


        }
        return (binary_search(array,target,start,end));

    }
    static int binary_search(int [] array,int target,int start ,int end){
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
}

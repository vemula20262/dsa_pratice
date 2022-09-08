package com.company;

public class binary_pratice {
    public static void main(String[] args) {

    }
    static int special_array(int[] nums){
        int k = nums.length;
        int start = 0;
        int end = nums.length-1;
        int mid = 0;
        int target = 0;
        while (start<=end && target<=k){
            mid = start +(end -start)/2;

            k++;

        }
        return mid;
    }
}

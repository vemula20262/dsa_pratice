package com.company;

public class search_in_rotated_array {
    public static void main(String[] args) {

    }
    public int search(int[] nums, int target) {
        int a = peak(nums);
        int b = -1;
        if (peak(nums)==-1){
            binary_search(nums,target,0,nums.length-1);
        }
        if (nums[peak(nums)]== target ){
            return peak(nums);
        }
        if (target>nums[0]){
            return binary_search(nums,target,0,a-1);
        }
        return binary_search(nums,target,a,nums.length-1);






        }



    static  int peak(int [] nums){
        int start = 0;
        int end = nums.length-1;

        while (start <= end ){
            int mid = start +(end - start )/2;
            if (mid<end && nums[mid]>nums[mid+1]){
                return mid;
            }
            if (mid>start && nums[mid-1]>nums[mid]){
                return mid-1;

            }
            if (nums[start]>nums[mid]){
                end = mid -1;
            }
            if (nums[start]<nums[mid]){
                start = mid +1;
            }
        }
        return -1;

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

package com.company;

public class Main {

    public static void main(String[] args) {
        int [] nums = {1,2,3,4,8,10,23};
        int target = 21;

	// write your code here
    }
    static int binary_search(int [] nums,int target){
        int start = 0;
        int end = nums.length-1;
        int mid = 0;
        while (start<end){
            mid = (end +start)/2;
            if (target <nums[mid]){
                end = mid-1;
            }
            else if (target>nums[mid]){
                start =mid+1;

            }
            else if(target==nums[mid]){
                return mid;
            }
        }
        return -1;
    }



    }


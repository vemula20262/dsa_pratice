package com.company;

public class FirstandLast {
    public static void main(String[] args) {
        int array [] = {-1,-1};


    }

    public int[] searchRange(int[] nums, int target) {
        int array [] = {-1,-1};
        int a = search (nums,target,false);
        int b = search (nums,target,true);
        array[0]=b;
        array[1]=a;
        return array;



    }
    int search (int [] nums,int target,boolean LorR ){
            int ans = -1;
            int start = 0;
            int end = nums.length-1;
            int mid = 0;
            while (start<=end){
                mid = (end +start)/2;
                if (target <nums[mid]){
                    end = mid-1;
                }
                else if (target>nums[mid]){
                    start =mid+1;

                }
                else{
                    ans = mid;
                }


                        if (LorR){
                            end = mid -1;
                        }
                        else {
                            start = mid +1;
                        }


                }
                return ans;
        }

    }


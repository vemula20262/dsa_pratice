package com.company;

import java.util.*;

public class leetcode_solving {
    public static void main(String[] args) {
        // STOPSHIP: 5/29/2022
        System.out.println(palindrome_count("abbbce",20));
    }

    static List<Integer> finding_no(int[] nums, int target) {
        int[] k = bubble_sort(nums);
        List<Integer> ans = new ArrayList<Integer>();
        for (int i = 0; i < k.length; i++) {
            if (k[i] == target) {
                ans.add(i);
            }


        }
        return ans;


    }

    static int[] bubble_sort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int sampled = 0;
            for (int j = 1; j < array.length - i; j++) {

                if (array[j] < array[j - 1]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                    sampled++;
                }

            }
            if (sampled == 0) {
                break;
            }

        }
        return array;
    }

    static int[] sorting(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            int swap = 0;
            for (int j = 1; j < nums.length - i; j++) {
                if (nums[j - 1] >= nums[j]) {
                    int temp = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = temp;
                    swap++;

                } else if (swap == 0) {
                    break;
                }
            }
        }
        return nums;
    }

    static boolean palindrome(int x) {
        int temp = x;
        int b = 0;
        while (x > 0) {
            int k = x % 10;
            b = b * 10 + k;
            x = x / 10;

        }
        if (b == temp) {
            return true;

        }
        return false;
    }

    static int roman(String s) {
        int sum = 0;
        HashMap<Character, Integer> ht1 = new HashMap<>();
        ht1.put('I', 1);
        ht1.put('V', 5);
        ht1.put('X', 10);
        ht1.put('L', 50);
        ht1.put('C', 100);
        ht1.put('D', 500);
        ht1.put('M', 1000);


        if (s.length() == 1) {
            return ht1.get(s.charAt(0));
        }


        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && ht1.get(s.charAt(i)) < ht1.get(s.charAt(i + 1))) {
                sum += ht1.get(s.charAt(i + 1)) - ht1.get(s.charAt(i));
                i++;
            } else {
                sum += ht1.get(s.charAt(i));
            }
//            System.out.println(sum + " " + i);
        }
//MCMXCIV = 1994 M = 1000, CM = 900, XC = 90 and IV = 4.
        return sum;


    }

    static boolean isValid(String s) {
        Stack<Character> stk = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));

            if (s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(') {
                stk.push(s.charAt(i));
            }
            if (s.charAt(i) == '}' && !stk.isEmpty()) {
                if (stk.pop() != '{') {
                    return false;

                }

            }
            if (s.charAt(i) == ']' && !stk.isEmpty()) {
                if (stk.pop() != '[') {
                    return false;

                }

            }
            if (s.charAt(i) == ')' && !stk.isEmpty()) {
                if (stk.pop() != '(') {
                    return false;

                }

            }
            return false;

        }
        return stk.isEmpty();

    }


    static int last_word(String s) {
        s = s.trim();
        if (s.length() < 1) {
            return 0;
        }

        int count = 0;
        for (int i = s.length() - 1; i > -1; i--) {
            if (s.charAt(i) != ' ') {
                System.out.println(s.charAt(i));
                count += 1;
            } else {
                break;
            }

        }
        return count;
    }

    static int[] plus_one(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i > -1; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;

            }
            digits[i] = 0;
        }
        int[] new_array = new int[n + 1];
        new_array[0] = 1;
        return new_array;

    }

    static int search_insert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid = 0;

        while (start <= end) {
            mid = start + (end - start) / 2;
            if (nums[mid] < target) {
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] == target) {
                return mid;
            }


        }
        if (nums[mid] > target) {
            return mid;
        }
        return mid + 1;

    }

    static int sqrt(int x) {
        int start = 1;
        int end = x;
        int mid = 0;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (mid * mid < x) {
                start = mid + 1;

            } else if (mid * mid > x) {
                end = mid - 1;
            } else if (mid * mid == x) {
                return mid;

            }
        }
        if ((mid + 1) * (mid + 1) < x) {
            return mid + 1;
        }
        return mid;
    }

    static boolean perfect_square(int num) {

        long start = 1;
        long end = num;
        long mid = 0;

        while (start < end) {
            mid = start + (end - start) / 2;
            if (mid * mid == num) {
                return true;
            } else if (mid * mid > num) {
                end = mid - 1;
                System.out.println(end);
            } else if (mid * mid < num) {
                start = mid + 1;
            }
        }
        return false;
    }
    static int coins(int n){
        int start = 1;
        int end = n;
        int mid = 0;
        while (start<end){
            mid = start+(end-start)/2;
            if (mid== (n*2)/(mid+1)){
                return mid;
            }
            if (mid< (n*2)/(mid+1)){
                 start =mid+1;
            }

            if (mid> (n*2)/(mid+1)){
                end =mid-1;
            }

        }
        return mid;
    }
    static int singel_number(int [] nums){
        int ans  = 0;
        for (int i = 1; i < nums.length; i++) {
            ans ^= nums[i];

        }
        return ans;
    }
    static boolean solve(int[] nums, int k){
        HashSet<Integer>set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if(set.contains(k-nums[i])){
                return true;
            }
            else {
                set.add(nums[i]);
            }

        }
        return false;
        }
    static  int solve(int [] nums){
        int count = 0;
        for(int i = 0; i <nums.length;i++){
            if (String.valueOf(nums[i]).length()%2 != 0){
                count ++;

            }

        }
        return count;
    }
    static int sum(int [ ] nums){
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            }
        int lsum = 0;
        for (int i = 0; i < nums.length; i++) {
            if(lsum== sum-lsum-nums[i]){
                return i;
            }
            lsum += nums[i];

        }
        return -1;
        }
     static boolean find(int[] nums) {
        if(nums.length ==1 ){
            return true;
        }
        boolean ans = true;
        int start = 0;
        int end = 0;
        for(int i = 0; i<nums.length;i++){
            if(nums[i]==1){
                start = i;
            }
        }
         System.out.println(start);
        for(int j =nums.length-1;j>=0;j-- ){
            if(nums[j]==1){
                end = j;
            }
        }
         System.out.println(end);
        for(int k = start;k<=end;k++){
            if(nums[k]!=1){
                ans = false;
            }
        }
        return ans;

    }
    static boolean increase(int [ ] nums ){
        boolean increase = true;
        boolean decrease  = true;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>=nums[i+1]){
                increase = false;
            }
            if(nums[i]<=nums[i+1]){
                decrease = false;
            }
        }
        return increase||decrease;

    }
    static  int pigeion(int [] nums){
        int sum = 0;
        int n = nums.length;
        int k = (n-1)*(n)/2;
        for (int i = 0; i < nums.length; i++) {
            sum +=nums[i];
        }
        return k -sum;
    }
    static int [] swaping (int [] nums,int index1, int index2 ){
        int temp = nums[index1];
        nums[index1]=nums[index2];
        nums[index2]= temp;
        return nums;
    }
    static int [] swap(int [] nums, int k){
        for (int i = 0; i < k; i++) {
            for (int j = i; j < nums.length-1; j++) {
                swaping(nums,j,j+1);
            }

        }
        return nums;
    }
    static  int [ ] zero(int [] nums){
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==0){
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(nums[j]==0){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        return nums;
    }
    static int palindrome_count(String s,int k){
        HashSet<Character> different =  new HashSet<Character>();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            different.add(s.charAt(i));
            count = different.size();
        }
        System.out.println(count);
        if(k%2==0){
            return (int)Math.pow(count,(k/2));

        }
        return  (int)Math.pow(count,(k/2))*count;
    }


    }



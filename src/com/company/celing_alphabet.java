package com.company;

public class celing_alphabet {
    public static void main(String[] args) {
        char letters[]={'a','b','c','d','e'};
        char target = 'c';
        System.out.println(seling_char(letters,target));

    }
    static char seling_char(char letters [],char target){
        int start = 0;
        int end = letters.length-1;
        int mid = 0;
        while (start<end){
            mid = (end +start)/2;
            if (target <letters[mid]){
                end = mid-1;
            }
            else if (target>letters[mid]){
                start =mid+1;

            }
        }
        return letters[start % letters.length];

    }
}

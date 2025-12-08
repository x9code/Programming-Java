package java_programs.array;

import java.util.Arrays;

public class NthRightRotation {
    public static int[] reverse(int[] arr, int l, int r){
        while (l < r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        return arr;
    }
    public static void main(String[] args) {
        /**
         * int[] num = {1,2,3,4,5}
         * output for 2nd right rotation : [4,5,1,2,3]
         * first : reverse the whole array [5,4,3,2,1]
         * second : reverse up to 2nd position
         * third : reverse remaining numbers after 2nd position
         */
        int[] num = {1,2,3,4,5};
        int len = num.length;
        int n = 3;
        n = n % len;
        reverse(num,0,len-1);
        reverse(num,0,n-1);
        System.out.println(Arrays.toString(reverse(num,n,len-1)));
    }
}

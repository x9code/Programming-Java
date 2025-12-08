package java_programs.array;

import java.util.Arrays;

public class ReverseArraySwapping {
    public static void main(String[] args) {
        int[] num = {2,4,5,8,5,9};
        int start = 0;
        int end = num.length-1;
        while (start < end){
            int temp = num[start];
            num[start]  = num[end];
            num[end] = temp;
            start++;
            end--;
        }
        System.out.println("reverse of array is : "+ Arrays.toString(num));
    }
}

package java_programs.array;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] num = {2,4,5,8,5,9};
        int len = num.length;
        int[] rev = new int[len];
        for (int i = 0 ; i < len; i++){
            rev[i] = num[len - 1 -i];
        }
        System.out.println("reverse of array is : "+ Arrays.toString(rev));
    }
}

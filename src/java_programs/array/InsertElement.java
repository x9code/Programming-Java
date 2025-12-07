package java_programs.array;

import java.util.Arrays;

public class InsertElement {
    public static int[] insert(int[] num,int index, int element){
        //int[] result = new int[num.length+1];
        int[] result= Arrays.copyOf(num,num.length+1);
        result[index] = element;
        for (int i = num.length - 1; i >= index; i--) {
            result[i + 1] = num[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {10, 20,50,70, 30};
        System.out.println(Arrays.toString(insert(nums,4,90)));
    }
}

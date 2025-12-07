package java_programs.array;

import java.util.Arrays;

public class InsertElement2 {
    public static int[] insert(int[] num,int index, int element){
        int[] result = new int[num.length+1];
        
        for (int i = 0 ; i < index;i++){
            result[i] = num[i];
        }
        result[index] = element;

        for (int i = index ; i <num.length;i++){
            result[i+1] = num[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {10, 20,50,70, 30};
        System.out.println(Arrays.toString(insert(nums,4,90)));
    }
}

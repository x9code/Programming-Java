package java_programs.array;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {2,4,3,2,1,6,5,4,3};
        Set<Integer> set = new LinkedHashSet<>();
        for (int n : arr){
            set.add(n);
        }
        int[] res = new int[set.size()];
        int a = 0;
        for (int c : set){
            res[a++] = c;
        }
        System.out.println(Arrays.toString(res));
    }
}

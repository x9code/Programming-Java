package java_programs.array;

import java.util.LinkedHashSet;
import java.util.Set;

public class SecondMaxElement {
    public static void main(String[] args) {
        int[] num = {1,2,6,6,7,7,5,4,3};
        //removing duplicate elements
        Set<Integer> set = new LinkedHashSet<>();
        for (int n : num){
            set.add(n);
        }
        //converting set to array
        int[] res = new int[set.size()];
        int a = 0;
        for (int c : set){
            res[a++] = c;
        }
        //sorting the array in descending order
        for (int i =0;i<res.length;i++ ){
            for (int j = i+1;j<res.length;j++){
                if (res[i] < res[j]){
                    int temp = res[i];
                    res[i] = res[j];
                    res[j] = temp;
                }
            }
        }
        System.out.println("second max element is : "+res[1]);
    }
}

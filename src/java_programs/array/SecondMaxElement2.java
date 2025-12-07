package java_programs.array;

import java.util.LinkedHashSet;
import java.util.Set;

public class SecondMaxElement2 {
    public static void main(String[] args) {
        int[] num = {1,2,6,6,7,7,5,4,3};
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int a : num){
            if (a > first){
                second = first;
                first = a;
            }else if (a > second && a!= first) {
                second = a;
            }
        }
        if (second == Integer.MIN_VALUE){
            System.out.println("no second maximum element is present");
        }else {
            System.out.println("second maximum element is :"+second);
        }
    }
}

package java_programs.array;
import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
    int[] a = {10, 20, 30, 20, 10};
    int[] res = Arrays.stream(a).distinct().toArray();
        System.out.println(Arrays.toString(res));
  }
}

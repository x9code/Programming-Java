package java_programs.array;

public class SubArrayAndSum {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};
        int k = 5;
        int n = num.length;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += num[j];
                if (sum == k) {
                    System.out.print("sub - arrays : ");
                    for (int l = i; l <= j; l++) {
                        System.out.print(num[l] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
}

package java_programs.practice;

import java.util.Scanner;

public class Number_Fibonacci {
    public static void fibonacci(int n) {
        int a = 0, b = 1, sum = 0;
        System.out.print(a+" "+b);
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            System.out.print(" " + sum);
            a = b;
            b = sum;
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter a number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibonacci(n);
    }
}

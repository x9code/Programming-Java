package java_programs.practice;

import java.util.Scanner;

public class Number_PrimeNumber {
    public static void isPrime(int n){
        boolean flag = true;

        if (n < 1){
            System.out.println(n + " is not a prime number");;
            return;
        }
        for (int i = 2; i * i <= n; i++){
            if (n % i == 0){
                flag = false;
                break;
            }
        }
        if (flag){
            System.out.println(n+" is Prime");
        }else{
            System.out.println(n+" is not Prime");
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter a number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        isPrime(n);
    }
}

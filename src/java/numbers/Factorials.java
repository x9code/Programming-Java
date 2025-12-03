package java.numbers;

import java.util.Scanner;

public class Factorials {
    public static void factorialOfNum(){
        System.out.println("Enter a number :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
       int fact = 1;
        for(int i=1;i<=num;i++){
            fact = fact * i;
        }
        System.out.println("Factorial for "+num+" is "+fact);
    }
    public static void main(String[] args) {
        factorialOfNum();
    }
}

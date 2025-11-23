package java1.numbers;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
//        //0 1 1 2 3 5 8 13 21 34
//        int series=5;
//        int n1=0,  n2=1,  sum=0 ;
//        System.out.print(n1+" " +n2);
//        for (int i=1;i<series;i++){
//            sum=n1+n2;
//            System.out.print(" "+sum);
//            n1=n2;
//            n2=sum;
//        }
//

        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int Series=sc.nextInt();
        int n1=0,  n2=1,  sum=0 ;
        System.out.print(n1+" " +n2);
        for (int i=2;i<Series;i++) {
            sum = n1 + n2;
            System.out.print(" " + sum);
            n1 = n2;
            n2 = sum;
        }

    }
}

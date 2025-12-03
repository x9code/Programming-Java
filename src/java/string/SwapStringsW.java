package java.string;

import java.util.Scanner;

public class SwapStringsW {
    public static void main(String[] args) {
        System.out.println("Enter string 1 :");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        System.out.println("Enter string 1 :");
        Scanner sc1 = new Scanner(System.in);
        String str2 = sc1.nextLine();
        System.out.println("Before swapping : ");
        System.out.println("str1 :" + str1);
        System.out.println("str2 :" + str2);
        int len = str1.length();
        str1 = str1+str2;
        str2 = str1.substring(0,len);
        str1 = str1.substring(len);
        System.out.println("After swapping :");
        System.out.println("str1 :"+str1);
        System.out.println("str2 :"+str2);
    }
}

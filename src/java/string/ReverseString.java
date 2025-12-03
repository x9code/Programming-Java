package java.string;

import java.util.Scanner;

//Reverse a string without using built-in methods.
public class ReverseString {
    public static void main(String[] args) {
        System.out.println("Enter a string :");
        Scanner sc  = new Scanner(System.in);
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        int len = ch.length;
        char[] rev = new char[len];
        for (int i = 0; i<len;i++){
            rev[i] = ch[len-1-i];
        }
        System.out.println("Reverse is : "+String.valueOf(rev));
    }
}

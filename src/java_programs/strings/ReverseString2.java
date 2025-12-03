package java_programs.strings;

import java.util.Scanner;

//Reverse a string without using built-in methods.
public class ReverseString2 {
    public static void main(String[] args) {
        System.out.println("Enter a string :");
        Scanner sc  = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder s = new StringBuilder(str);
        System.out.println(s.reverse());
    }
}

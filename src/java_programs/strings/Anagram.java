package java_programs.strings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        System.out.println("Enter string1: ");
        Scanner sc1 = new Scanner(System.in);
        String str1 = sc1.nextLine();
        char[] ch1 = str1.toCharArray();
        System.out.println("Enter string2: ");
        Scanner sc2 = new Scanner(System.in);
        String str2 = sc2.nextLine();
        char[] ch2 = str2.toCharArray();
        if(str1.length() != str2.length()){
            System.out.println("not anagram");
            return;
        }
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if (Arrays.equals(ch1,ch2)){
            System.out.println("Both are Anagram");
        }else {
            System.out.println("Both are not Anagram");
        }
    }
}

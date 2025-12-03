package java1.string;

import java.util.Scanner;
import java.util.SortedMap;

public class LowerToUpperCase {
    public static void main(String[] args) {
        System.out.println("Enter a string :");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        for (int i = 0; i< ch.length;i++) {
            if(ch[i]>=97 && ch[i]<=122) {
                ch[i] = (char) (ch[i] - 32);
            }
        }
        System.out.println(ch);
    }
}

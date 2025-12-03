package java_programs.numbers;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String n = Integer.toString(num);
        String rev = "";
        for (int i = n.length()-1;i>=0;i--){
            rev = rev + n.charAt(i);
        }
        System.out.println("reverse of "+num+" is: "+Integer.parseInt(rev));
    }
}

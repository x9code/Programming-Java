package java1.string;

import java.util.Scanner;

public class VowelAndConsonantCount {
    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        char[] cha = s.toCharArray();
        String vowels = "aeiou";
        int vowelCount = 0;
        int consonantCount = 0;
        for(char ch : cha){
            if (Character.isLetter(ch)){
                if (vowels.indexOf(ch)!=-1){
                    vowelCount++;
                }else {
                    consonantCount++;
                }
            }
        }
        System.out.println("number of vowels : "+vowelCount);
        System.out.println("number of consonants:"+consonantCount);
    }
}

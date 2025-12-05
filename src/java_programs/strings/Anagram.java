package java_programs.strings;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "cab";
        char[] ch1 = str1.toCharArray();
        String str2 = "bca";
        char[] ch2 = str2.toCharArray();
        if(str1.length() != str2.length()){
            System.out.println("not anagram");
            return;
        }
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if (Arrays.equals(ch1,ch2)){
            System.out.println("is Anagram");
        }else {
            System.out.println("not Anagram");
        }
    }
}

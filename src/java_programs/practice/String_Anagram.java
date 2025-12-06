package java_programs.practice;

import java.util.Arrays;

public class String_Anagram {
    public static void main(String[] args) {
        String a = "listen";
        char[] ac = a.toCharArray();
        String b = "silent";
        char[] bc = b.toCharArray();
        Arrays.sort(ac);
        Arrays.sort(bc);
        if (Arrays.equals(ac,bc)){
            System.out.println("is anagram");
        }else{
            System.out.println("not anagram");
        }
    }
}

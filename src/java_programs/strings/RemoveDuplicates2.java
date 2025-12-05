package java_programs.strings;

import java.util.LinkedHashSet;

public class RemoveDuplicates2 {
    public static void main(String[] args) {
        String str = "deepak";
        String res = "";
        char[] ch = str.toCharArray();
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for(char c : ch){
            set.add(c);
        }
        StringBuilder sb = new StringBuilder();
        for(char c : set){
            sb.append(c);
        }
        System.out.println(sb);
    }
}

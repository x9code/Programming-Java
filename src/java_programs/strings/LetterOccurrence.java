package java_programs.strings;

import java.util.LinkedHashMap;

public class LetterOccurrence {
    public static LinkedHashMap<Character, Integer> letterCount(String s){
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        String str = s.replaceAll("\\s","");
        char[] ch = str.toCharArray();
        for (char c : ch){
            if (map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else {
                map.put(c,1);
            }
        }
       return map;
    }
    public static void main(String[] args) {
        String s = "hello my name is deepak kumar rana";
        System.out.println(letterCount(s));
    }
}

package java_programs.strings;

import java.util.LinkedHashMap;

public class WordOccurrence {
    public static LinkedHashMap<String ,Integer> count(String str){
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        String[] st = str.toLowerCase().split(" ");
        for(String w : st){
            if (map.containsKey(w)){
                map.put(w,map.get(w)+1);
            }else {
                map.put(w,1);
            }
        }
        return  map;
    }
    public static void main(String[] args) {
        String s = "Java is a programming language and java is old language";
        System.out.println(count(s));
    }
}

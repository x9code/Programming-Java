package java_programs.strings;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "deepak";
        String res = "";
        for (int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);
            if(res.indexOf(ch) == -1){
                res += ch;
            }
        }
        System.out.println(res);
    }
}

package java1.string;
//Reverse a string without using built-in methods.
public class ReverseString {
    public static void main(String[] args) {
        String s = "Deepak";
        char[] ch = s.toCharArray();
        int len = ch.length;
        char[] ch1 = new char[len];
        for(int i =0;i<=len-1;i++){
            ch1[i] = ch[len-1-i];
        }
        String n = String.valueOf(ch1);
        System.out.println("reversed string : "+n);
    }
}

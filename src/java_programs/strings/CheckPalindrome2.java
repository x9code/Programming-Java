package java_programs.strings;

public class CheckPalindrome2 {
    public static void main(String[] args) {
        String str = "madam";
        int len = str.length();
        String half1 = str.substring(0,len/2);
        StringBuilder sb = new StringBuilder(str);
        String rev = String.valueOf(sb.reverse());
        String half2 = rev.substring(0,len/2);
        if (half1.equals(half2)){
            System.out.println("Given String ia a Palindrome");
        }else {
            System.out.println("Given String is not a palindrome");
        }
    }
}

package java_programs.array;

public class CharPalindrome {
    public static void main(String[] args) {
        char[] ch = {'m','a','d','a','m'};
        int len = ch.length;
        int mid = len / 2;
        boolean res = true;
        for (int i = 0 ; i < len ; i++){
            if (ch[i] != ch[len - 1 - i]){
                res = false;
                break;
            }
        }
        if(res){
            System.out.println("Given char array is palindrome");
        }else{
            System.out.println("Given char array is not palindrome");
        }
    }
}

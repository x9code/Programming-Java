package java.string;
//Check if a given string is a palindrome
public class CheckPalindrome {
    public static void main(String[] args) {
        String n = "mommom";
        int len = n.length();
        boolean res = true;

        for (int i = 0; i < len / 2; i++) {
            if (n.charAt(i) != n.charAt(len - 1 - i)) {
                res = false;
                break;
            }
        }
        System.out.println(res);
    }
}

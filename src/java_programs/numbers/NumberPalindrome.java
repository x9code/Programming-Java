package java_programs.numbers;

public class NumberPalindrome {
    public static void main(String[] args) {
        int num = 12121;
        int originalNum = num;
        int rev = 0;
        while (num != 0) {
        int digit = num % 10;
        rev = rev * 10 + digit;
        num = num / 10;
        }
        if (originalNum == rev) {
            System.out.println("Palindrome");
        }else{
            System.out.println("Not palindrome");
        }
    }
}

package java_programs.pattern;

public class Number_Palindrome_Diamond {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");//spaces
            }
            for (int k = i; k >= 1; k--) {//descending
                System.out.print(k);
            }
            for (int k = 2; k <= i; k++) { //ascending
                System.out.print(k);
            }
            System.out.println();
        }

        for (int i = n-1; i >= 1; i--) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--) {//descending
                System.out.print(k);
            }
            for (int k = 2; k <= i; k++) { //ascending
                System.out.print(k);
            }

            System.out.println();
        }
    }
}

package java_programs.practice;

public class Number_StrongNumber {
    public static int factorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
    public static void main(String[] args) {
        int num = 145;
        int original = num;
        int sum = 0;
        while (num != 0){
            int digit = num % 10;
            sum += factorial(digit);
            num /=10;
        }
        if(sum == original){
            System.out.println(original+" is a strong number");
        }else {
            System.out.println(original+" is not a strong number");
        }
    }
}

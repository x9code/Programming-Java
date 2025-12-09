package java_programs.numbers;

public class StrongNumber {
    public static int factorial(int n){
        int factorial = 1;
        for (int i = 1; i <= n; i++){
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
            num = num/10;
        }
        if (sum == original){
            System.out.println(original+" is strong number");
        }else  {
            System.out.println(original+" is not strong number");
        }
    }
}

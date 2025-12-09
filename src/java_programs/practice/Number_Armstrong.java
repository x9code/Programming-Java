package java_programs.practice;

public class Number_Armstrong {
    public static void main(String[] args) {
        int num = 153;
        int original = num;
        int sum = 0;
        int count = String.valueOf(num).length();
        while (num != 0) {
            int digit = num % 10;
            sum += (int) Math.pow(digit, count);
            num /= 10;
        }
        if (sum == original){
            System.out.println(original+" is Armstrong");
        }else {
            System.out.println(original+" is not Armstrong");
        }
    }
}
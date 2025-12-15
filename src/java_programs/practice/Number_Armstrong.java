package java_programs.practice;

public class Number_Armstrong {
    public static void main(String[] args) {
        int num = 153;
        int sum = 0;
        int count = String.valueOf(num).length();
        int original = num;
        while (num != 0){
            int digit = num % 10;
            sum += (int) Math.pow(digit,count);
            num /= 10;
        }
        if (sum == original){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not Armstrong Number");
        }
    }
}
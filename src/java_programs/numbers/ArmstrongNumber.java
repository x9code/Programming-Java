package java_programs.numbers;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int n = 153;
        int original = n;
        int count = String.valueOf(n).length();
        int sum = 0;
        while (n != 0){
            int digit = n % 10;
            sum += (int) Math.pow(digit,count);
            n = n/10;
        }
        if (sum == original){
            System.out.println(original+" is an Armstrong number");
        }else{
            System.out.println(original+" is Not an Armstrong number");
        }
    }
}

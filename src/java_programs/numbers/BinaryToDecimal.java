package java_programs.numbers;

public class BinaryToDecimal {
    public static void main(String[] args) {
        int binary = 1001011;
        int count = 0;
        int decimal = 0;
        while (binary != 0) {
            int digit = binary % 10;
            decimal += digit * Math.pow(2,count);
            binary = binary / 10;
            count++;
        }
        System.out.println(decimal);
    }
}

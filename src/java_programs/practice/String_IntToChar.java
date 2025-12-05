package java_programs.practice;

public class String_IntToChar {
    static String[] ones = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    static String[] twos = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    static String[] tens = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };
    public static String convert(int num){
        if (num < 10){
            return ones[num];
        } else if (num < 20) {
            return twos[num%10];
        } else if (num < 100) {
            return tens[(num/10)]+" "+ones[(num%10)];
        } else if (num < 1000) {
            return ones[num/100]+" hundred "+convert(num%100);
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println(convert(698));
    }
 }

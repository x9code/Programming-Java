package java_programs.strings;

public class IntToChar {
    static String[] ones = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
            "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen",
            "Sixteen", "Seventeen", "Eighteen", "Nineteen" };
    static String[] tens = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };

    public static String convertToChar(int num){
        if (num<20){
            return ones[num];
        }
        else if (num<100){
            return tens[num/10] + ((num % 10 != 0) ? " " +ones[num % 10] : "");
        }
        else {
            return ones[num / 100] + " Hundred" +
                    ((num % 100 != 0) ? " " + convertToChar(num % 100) : "");
        }
    }
    public static void main(String[] args) {
        int num = 234;
        System.out.println(convertToChar(num));
    }
}

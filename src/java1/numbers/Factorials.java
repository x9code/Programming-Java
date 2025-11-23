package java1.numbers;
//Find factorial of a number using recursion and iteration.
public class Factorials {
    public static void factorialOfNum(int num){
       int fact = 1;
        for(int i=1;i<=num;i++){
            fact = fact * i;
        }
        System.out.println(fact);
    }
    public static void main(String[] args) {
        factorialOfNum(4);

    }

}

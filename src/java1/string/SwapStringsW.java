package java1.string;

public class SwapStringsW {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        System.out.println("Before swapping : ");
        System.out.println("str1 :" + str1);
        System.out.println("str2 :"+ str2);
        int len = str1.length();
        str1 = str1+str2;
        str2 = str1.substring(0,len);
        str1 = str1.substring(len);
        System.out.println("After swapping :");
        System.out.println("str1 :"+str1);
        System.out.println("str2 :"+str2);
    }
}

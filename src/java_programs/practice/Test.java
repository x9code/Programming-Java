package java_programs.practice;

public class Test {
    public static void main(String[] args) {
        String s1 = new String("Java");
        String s2 = "Java";
        String s3 = s1.intern();
        System.out.println((s1 == s2) + " " + (s2 == s3));
    }
}

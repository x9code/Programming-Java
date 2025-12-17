package java_programs.strings;

public class SeparateLetterAndDigit {
    public static void main(String[] args) {
        String str = "A5TE63G53GFDS5";
        char[] arr = str.toCharArray();
        StringBuilder alphabet = new StringBuilder();
        StringBuilder digits = new StringBuilder();
        for (char c : arr) {
            if (Character.isLetter(c)) {
                alphabet.append(c);
            }else if (Character.isDigit(c)) {
                digits.append(c);
            }
        }
        System.out.println("alphabets: "+alphabet);
        System.out.println("digits: "+digits);
    }
}

package java_programs.practice;

public class String_VoCoCount {
    public static void main(String[] args) {
        String a = "deepak abcd";
        String vowels = "aeiou";
        int vowelCount = 0;
        int consonantCount = 0;
        for(char c: a.toCharArray() ){
            if (Character.isLetter(c)){
                if (vowels.indexOf(c)==-1){

                    consonantCount++;
                }else{
                    vowelCount++;
                }
            }
        }
        System.out.println("vowels :"+vowelCount);
        System.out.println("consonant :"+consonantCount);

    }
}

package java_programs.strings;

public class DuplicateString {
    public static void main(String[] args) {
        String str="kumarr";
        int count=0;
        char a []=str.toCharArray();
        for (int i=0;i<a.length;i++){
            for (int j=i+1;j<a.length;j++){
                if (a[i]==a[j]){
                    System.out.println("duplicate character in the string are:"+a[j]);
                    count++;
                    System.out.println("repeeat="+count);


                }


            }
        }
    }
}

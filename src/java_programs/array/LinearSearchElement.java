package java_programs.array;

public class LinearSearchElement {
    public static void linearSearch(int num){
        int[] arr ={1,6,4,7,8,4,9,3};
        boolean found = false;
        for (int i = 0; i<arr.length;i++){
            if (arr[i]==num){
                System.out.println("element found at index: "+i);
                found = true;
                break;
            }
        }
        if (!found){
            System.out.println("no such element found");
        }
    }
    public static void main(String[] args) {
        linearSearch(3);
    }
}

package java_programs.array;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        int key = 60;
        int right = arr.length-1;
        int left = 0;

        boolean found = false;
        while (left<=right){
            int mid = (left+right)/2;
            if (arr[mid] == key){
                System.out.println("element found at index : "+mid);
                found= true;
                break;
            }
            if (key > arr[mid]){
                left = mid + 1;

            } else {
                right = mid - 1;
            }
        }
        if (!found) {
            System.out.println("element is not found");
        }
    }
}

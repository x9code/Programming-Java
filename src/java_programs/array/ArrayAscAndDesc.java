package java_programs.array;

public class ArrayAscAndDesc {
	public static void main(String[] args) {
		int[] arr = {4,5,2,7,8,1,9,6};
		int n = arr.length;
		int mid = n/2;
		//sorting the whole array
		for(int i = 0 ; i< n;i++) {
			for(int  j = i+1 ;j<n;j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
	}
		// reversing the right half to make it descending

		int left = mid;
		int right = n-1;
		while(left < right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
		System.out.println("result is : ");
		for (int i : arr) {
			System.out.print(i+",");
		}
	}
}

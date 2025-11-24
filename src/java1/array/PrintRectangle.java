package java1.array;

public class PrintRectangle {
	public static void main(String[] args) {
		int length = 10;
		int height = 5;	
		for(int i = 0; i < height ; i++) {
			for(int j = 0; j<length ; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
}

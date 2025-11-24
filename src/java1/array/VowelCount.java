package java1.array;

import java.util.Scanner;

public class VowelCount {
	public static void main(String[] args) {
		System.out.println("Enter a string : ");
		Scanner sc  = new Scanner(System.in);
		String str = sc.nextLine().toLowerCase();
		int aCount = 0; int eCount = 0; int iCount = 0; int oCount = 0; int uCount = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			switch (ch) {
			case 'a':
				aCount++;
				break;
			case 'e':
				eCount++;
				break;
			case 'i':
				iCount++;
				break;
			case 'o':
				oCount++;
				break;
			case 'u':
				uCount++;
				break;
				
			}
		}
		System.out.println("Vowel Frequency : ");
		System.out.println("a :"+aCount);
		System.out.println("e :"+eCount);
		System.out.println("i :"+iCount);
		System.out.println("o :"+oCount);
		System.out.println("u :"+uCount);
	}
}

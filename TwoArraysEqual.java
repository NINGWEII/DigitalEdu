import java.util.Scanner;

public class TwoArraysEqual {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please define array size: ");
		int arrSize = scan.nextInt();
		
		int[] arr1 = new int[arrSize];
		int[] arr2 = new int[arrSize];
		
		System.out.print("Submit elements for first array: ");
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = scan.nextInt();
		}
		System.out.print("Submit elements for second array: ");
		for(int i = 0; i < arr1.length; i++) {
			arr2[i] = scan.nextInt();
		}
		
		printArray(arr1);
		printArray(arr2);
		
		if(isEqual(arr1, arr2)) {
			System.out.println("Both arrays are equal");
		}else {
			System.out.println("Arrays are not equal");
		}
	}
	
	private static void printArray(int[] arr) {
		for(int elem : arr) {
			System.out.print(elem + " ");
		}
		System.out.println();
	}
	
	private static boolean isEqual(int[] arr1, int[] arr2) {
		if(arr1.length != arr2.length) 
			return false;
		
		for(int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i]) {
				return false;
			}
		}
		
		return true;
	}
		
	
}

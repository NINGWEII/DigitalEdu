import java.util.Scanner;

public class DigitaEdu_HomeWork4_Problem1 {
	public static void main(String[] args) {

//(Problem 1)
//		დაწერეთ private static boolean contains(int x, int[] arr) ფუნქცია, რომელიც
//		ამოწმებს გადაცემული მასივი შეიცავს თუ არა x-ს
		
		int arr[] = {8, 6, 5, 3, 4};
		boolean arrayContainsThisValue = false;
		Scanner in = new Scanner(System.in);
		System.out.print("Submit a value: ");
		int inputValue = in.nextInt(); 
		
		if (contains(arr, arrayContainsThisValue, inputValue)) 
			System.out.println("Array contains this value!");
		else System.out.println("Array Doesn't contain this value!");
		
	}	
	
	private static boolean contains(int[] arr, boolean arrayContainsThisValue, int inputValue) {
		 for (int i = 0; i < arr.length; i++) {
			 if (arr[i] == inputValue) arrayContainsThisValue = true;
		 }
		return arrayContainsThisValue;
	}
	
}

import java.util.Arrays;
import java.util.Scanner;

public class DigitalEdu_HomeWork_4 {
	
//-----------------------------First Problem-------------------------------

//(Problem 1)
//	დაწერეთ private static boolean contains(int x, int[] arr) ფუნქცია, რომელიც
//	ამოწმებს გადაცემული მასივი შეიცავს თუ არა x-ს
	
	private static void firstProblem() {
		int arr[] = {8, 6, 5, 3, 4};
		boolean arrayContainsThisValue = false;
		Scanner in = new Scanner(System.in);
		System.out.print("Submit a value: ");
		int inputValue = in.nextInt(); 
		if (contains(arr, arrayContainsThisValue, inputValue)) 
			System.out.println("Array " + Arrays.toString(arr) + " contains this value!");
		else System.out.println("Array Doesn't contain this value!");
	}
	private static boolean contains(int[] arr, boolean arrayContainsThisValue, int inputValue) {
		 for (int i = 0; i < arr.length; i++) {
			 if (arr[i] == inputValue) arrayContainsThisValue = true;
		 }
		return arrayContainsThisValue;
	}
	
//------------------------Second Problem-----------------------------------------
	
//(Problem 2)
//	დაწერეთ ფუნქცია private static boolean sameFirstLast(int[] nums), რომელიც
//	აბრუნებს true-ს თუ მისი პირველი და ბოლო ელემენტი ტოლია, false-ს
//	წინააღმდეგ შემთხვევაში. მაგალითად: sameFirstLast([1, 2, 3]) -> false;
//	sameFirstLast([1, 2, 3, 1]) -> true
	
	private static void secondProblem() {
		int arr[] = {2, 4, 3, 1, 9, 6, 8, 7, 3, 2};
		boolean sameFirstLast = false;
		sameFirstLast(arr, sameFirstLast);
		
		if (sameFirstLast(arr, sameFirstLast))
			System.out.println("First and last elements of the array " + Arrays.toString(arr) + " are equal!");
		else System.out.println("First and last elements of this array are not equal");
	}

	private static boolean sameFirstLast(int[] arr, boolean sameFirstLast) {
		if (arr[0] == arr[arr.length-1]) 
			sameFirstLast = true;
		
		return sameFirstLast;
	}

//--------------------------------Third Problem-----------------------------------

//(Problem 3)
//დაწერეთ ფუნქცია countEvents(int[] arr), რომელიც დაგიბრუნებთ რიცხვს -
//რამდენი ლუწი რიცხვია მასივში. მაგალითად: countEvens([2, 2, 0]) →
//3; countEvens([1, 3, 5]) → 0
	
	 static void thirdProblem() {
		int arr[] = {2, 6, 17, 15, 1, 8, 14, 8, 3, 7, 13, 12,  4, 3, 18, 1};
		int howManyEven = arr.length;
		countEvens(arr, howManyEven);
		System.out.println("There are " + countEvens(arr, howManyEven) + " even numbers in an array of " + Arrays.toString(arr) + "");
	}

	 private static int countEvens(int[] arr, int howManyEven) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 1) 
				howManyEven = howManyEven - 1;
		}
		return howManyEven;
	 }

//----------------------------Fourth Problem-----------------------------------------
	 
	//(Problem 4)
//		დაწერეთ ფუნქცია private static int sum(int[] arr), რომელიც დააბრუნებს
//		მასივში ელემენტების ჯამს.
	
	private static void fourthProblem() {	
		int arr[] = {4, 2, 3, 1};
		int resultSum = 0;
		sum(arr, resultSum);
		System.out.println("The sum of all values in an array of " + Arrays.toString(arr) + " is equal to: " + sum(arr, resultSum));	
	}
	private static int sum(int[] arr, int resultSum) {
		for (int i = 0; i < arr.length; i++) {
			resultSum = resultSum + arr[i];
		}            	                 
		return resultSum;
	}
	
//---------------------------------Fifth Problem---------------------------------
	
//(Problem 5)
//	დაწერეთ ფუნქცია private static int sumEvens(int[] arr), რომელიც
//	დააბრუნებს მასივში ლუწ ინდექსზე მყოფი ელემენტების ჯამს.
			
	private static void fifthProblem() {
		//indexes -->0  1  2  3  4  5  
		int arr[] = {6, 4, 7, 5, 2, 1};
		int resultEvenSum = 0; 
		int x = arr.length;
		System.out.println("The sum of values on even indexes in the array of " + Arrays.toString(arr) + " is equal to " + calculateSumOfNumbersOnEvenIndex(arr, resultEvenSum));
	}
	private static int calculateSumOfNumbersOnEvenIndex(int[] arr, int resultEvenSum) {
		for (int i = 2; i < arr.length; i += 2) {
			resultEvenSum += arr[i];
		}
		return resultEvenSum;
	}
	
//-----------------------------Sixth Problem--------------------------------------
	
//(Problem 6)
//	დაწერეეეეეეეეთ ფუნქცია private static int sumOdds(int[] arr), რომელიც
//	დააბრუნებს მასივში კენტ ინდექსებზე მყოფი ელემენტების ჯამს.
	   
	private static void sixthProblem() {
		//indexes -->0  1  2  3  4  5  6  7  8  9
		int arr[] = { 3, 1, 4, 8, 5, 7, 2 };
		int resultOddSum = 0;
		System.out.println("The sum of values on odd indexes in an array of " + Arrays.toString(arr) + " is equal to " + calculateSumOfNumbersOnOddIndex(arr, resultOddSum));
	}
	private static int calculateSumOfNumbersOnOddIndex(int[] arr, int resultOddSum) {
		for (int i = 1; i < arr.length; i += 2) {
			resultOddSum = resultOddSum + arr[i];
		}
		return resultOddSum;
	}
	
	public static void main(String[] args) {
		
//		firstProblem();
//		secondProblem();
//		thirdProblem();
//		fourthProblem();
//		fifthProblem();
//		sixthProblem();
		
	}
}

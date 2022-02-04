import java.util.Arrays;

public class DigitalEdu_HomeWork5 {
	
//--------------------------------Problem 1--------------------------------------
//
//						Calculate average of an array
	
	private static void firstProblem() {
		System.out.println("------------firstProblem-------------");
		int arr[] = {2, 4, 5, 8, 1};
		int arrAverage = 0;
		printFirstProblemResult(arr, arrAverage);
	}
	private static void printFirstProblemResult(int[] arr, int arrAverage) {
		System.out.println("Average of an array " + Arrays.toString(arr) + " is equal to: " + calculateArrAverage(arr, arrAverage) + " \n");
	}
	private static int calculateArrAverage(int[] arr, int arrAverage) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			arrAverage = sum / arr.length;
		} 
		return arrAverage;	
	}
	
//--------------------------------Problem 2-------------------------------------------

// 		     Find index of an element. If element not found print out -1
	
	private static void secondProblem() {
		System.out.println("------------secondProblem-------------");
		int arr[] = {2, 6, 5, 7, 3, 9, 8};
		int num = 8;
		int indexOfNum = 0;
		printSecondProblemResult(arr, indexOfNum, num);
	}
	private static void printSecondProblemResult(int[] arr, int indexOfNum, int num) {
		if(contains(arr, num))
		System.out.println("In an array of " + Arrays.toString(arr) + " Number " + num + " is on index " + findNumIndex(num, arr, indexOfNum) + ".\n ");
		else System.out.println(arr.length - (arr.length + 1));
	}
	private static int findNumIndex(int num, int[] arr, int indexOfNum) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == num) indexOfNum = i;
		}
		return indexOfNum;
	}
	private static boolean contains(int[] arr, int num) {
		boolean contains = false;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == num) contains = true;
		} return contains;
		
	}
	
//------------------------------Problem 3-------------------------------------------

//					Find minimal element in an array
	
	private static void thirdProblem() {
		System.out.println("------------thirdProblem-------------");
		int arr[] = {2, 4, 5, 8, 1, 8, 7, 3, 6, 2, 9};
		int minElement = 0;
		
		printThirdProblemResult(arr, minElement);
	}
	
	private static void printThirdProblemResult(int[] arr, int minElement) {
		System.out.println("Minimal element in an array " + Arrays.toString(arr) + " is " + findMinelement(arr, minElement) + ". \n");
	}
	private static int findMinelement(int[] arr, int minelement) {
		int temp;
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr[0];
	}
	
//-------------------------------fourthProblem-------------------------------------
	
//					Find maximal element in an array
	
	private static void fourthProblem() {
		System.out.println("------------fourthProblem-------------");
		int arr[] = {2, 4, 5, 8, 1, 8, 7, 12, 6, 2, 9};
		int maxElement = 0;
		printFourthProblemResult(arr, maxElement);
	}
	private static void printFourthProblemResult(int[] arr, int maxElement) {
		System.out.println("Max element in an array " + Arrays.toString(arr) + " is " + findMaxElement(arr, maxElement) +"");
	}
	private static int findMaxElement(int[] arr, int maxelement){
		int temp;
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr[arr.length - 1];
	}
	
//==============================================================================
	
	public static void main(String[] args) {

		firstProblem(); 
	
		secondProblem();
		
		thirdProblem();
						
		fourthProblem();

	}
		
}

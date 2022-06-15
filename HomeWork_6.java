import java.util.Arrays;

public class DigitalEdu_HomeWork_6 {
	
//---------------------------First Problem--------------------------------------------
	
	private static void firstProblem() {
		System.out.println("--------------------First Problem-----------------");
		int[] arr = {8, -4, 3, 5, -2, 12, -54};
		printCountPositives(arr);
	}
	private static int countPositives(int[] arr) {
		int amountOfPositiveNumbers = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > 0)
				amountOfPositiveNumbers++;
		}
		
		return amountOfPositiveNumbers;
	}
	private static void printCountPositives(int[] arr) {
		System.out.println("Amount of positive numbers in an array of " + Arrays.toString(arr) + " is equal to: " + countPositives(arr) + " \n");					
	}
	
//----------------------Second Problem--------------------------------------------------
	
	private static void secondProblem() {
		System.out.println("-------------Second Problem-------------------");
		int[] arr = {8, -4, 3, -1, 5, -2, };
		printCountNegatives(arr);
	}
	private static int countNegatives(int[] arr) {
		int amountOfNegativeNumbers = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < 0)
				amountOfNegativeNumbers++;
		}
		
		return amountOfNegativeNumbers;
	}
	private static void printCountNegatives(int[] arr) {
		System.out.println("Amount of negative numbers in an array of " + Arrays.toString(arr) + " is equal to: " + countNegatives(arr) + " \n");
	}
	
//------------------------------Third Problem---------------------------------------------
	
	private static void thirdProblem() {
		System.out.println("----------Third Problem----------------");
		int[] arr = {-5, 5, 2, -4, 3 };
		printPositivesSum(arr);
	}
	private static int positivesSum(int[] arr) {
		int sumOfPositives = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > 0)
				sumOfPositives += arr[i];
		}
		return sumOfPositives;
	}
	private static void printPositivesSum(int[] arr) {
		System.out.println("Sum of positive numbers in an array of " + Arrays.toString(arr) + " is equal to: " + positivesSum(arr) + " \n");
	}
	
//-------------------------------Fourth Problem---------------------------------------
	
	private static void fourthProblem() {
		System.out.println("-------------------Fourth Problem----------------");
		int[] arr = {2, -3, 1, -4, 7, 8, -6};
		printNegativesSum(arr);
	}
	private static int negativesSum(int[] arr) {
		int sumOfNegatives = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < 0)
				sumOfNegatives += arr[i];
		}
		return sumOfNegatives;
	}
	private static void printNegativesSum(int[] arr) {
		System.out.println("Sum of negative numbers in an array of " + Arrays.toString(arr) + " is equal to: " + negativesSum(arr) + " \n");
	}
	
	public static void main(String[] args) {
		
		firstProblem();
		secondProblem();
		thirdProblem();
		fourthProblem();
		
	    System.out.println("      |\\      _,,,---,,_");
	    System.out.println("ZZZzz /,`.-'`'    -.  ;-;;,_");
	    System.out.println("     |,4-  ) )-,_. ,\\ (  `'-'");
	    System.out.println("    '---''(_/--'  `-'\\_)  "); 
		
	}
}

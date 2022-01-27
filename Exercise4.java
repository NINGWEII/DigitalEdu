import java.util.Scanner;

public class Exercise4 {
	public static void main(String[] args) {
		

		//(Exercise 4)		 Print out the sum of ten input values
		
		
			
			Scanner scan = new Scanner(System.in);
			
			System.out.print("Submit ten numbers to display their sum: ");
			int[] arr = new int[10];
			for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
			}
			
			int resultSum =	addTenNumbers(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7], arr[8], arr[9]);
			System.out.println("The sum of numbers you have submitted equals to: " + resultSum);
		
	}
	
	static int addTenNumbers(int element0, int element1, int element2, int element3, int element4, int element5, int element6, int element7, int element8, int element9) {
		int resultSum = element0 + element1 + element2 + element3 + element4 + element5 + element6 + element7 + element8 + element9;
	
		return resultSum;
	}
	
	

}

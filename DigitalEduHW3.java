import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
public class DigitalEduHW3 {
	public static void main(String[] args) {
//		exercise1(); // Print out numbers from 0 to 100	
//		exercise2(); // Calculate the results of input numeric value multiplied by 1 to 10
//		exercise3(); // Print even numbers from 0 to 50. Print odd numbers from 51 to 100
//		exercise4(); // Print out the sum of ten input values
//		exercise5(); // Check if input number is prime number or not
		
	}
	
//*******************************************************************************	

//(Exercise 1)			Print out numbers from 0 to 100	
	
	static void exercise1 () {
		
		for (int i = 0; i <= 25; i++) {
			System.out.print(i + " ");
			if (i == 25) { 
				System.out.println();
				for (int j = 26; j <= 50; j++) {
					System.out.print(j + " ");
					if (j == 50) {
						System.out.println();
						for (int k = 51; k <= 75; k++) { 
							System.out.print(k + " ");
							if (k == 75) {
								System.out.println();
								for (int l = 76; l <= 100; l++) {
									System.out.print(l + " ");
								}
							}
						}
					}
				}
			}
		}
		
	}

//================================================================================
		
//(Exercise 2)	  Calculate the results of input numeric value multiplied by 1 to 10
		
	static void exercise2 () {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Submit a value to be multiplied from one to ten ");
		System.out.print("Submit here: ");
		int inputValue = scan.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			int j = i * inputValue;
			System.out.println(""+ inputValue +" * "+ i +" = "+ j +"");
		}
	}

	
//================================================================================
		
//(Exercise 3)	Print even numbers from 0 to 50. Print odd numbers from 51 to 100
	
	static void exercise3 () {	
		
		System.out.print("Even numbers from 0 to 50: ");
		for (int i = 0; i <= 50; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
				continue;
			}
		}
		System.out.println();
		
		System.out.print("Odd numbers from 51 to 100: ");
		for (int i = 51; i <= 100; i++ ) {
			if (i % 2 == 1) {
				System.out.print(i + " ");
				continue;
			}
		}
	}
		
//=================================================================================
			
//(Exercise 4)		 Print out the sum of ten input values
	
	static void exercise4 () {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Submit ten numbers to display their sum: ");
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
		arr[i] = scan.nextInt();
		}
		
		int sum = IntStream.of(arr).sum();
		System.out.println("The sum of "+ Arrays.toString(arr) +" equals to: "+ sum);
	}
		
//==================================================================================
		
//(Exercise 5)	Check if input number is prime number or not
	
	static void exercise5 () {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Submit a number: ");
		int inputValue = scan.nextInt();
		boolean check = false;
		for (int i = 2; i <= inputValue / 2; i++) {
			if (inputValue % i == 0) {
				check = true;
				break;
			}
		}
		if (check) {
			System.out.println("" + inputValue + " is not a prime number");
		}
		else {
			System.out.println("" + inputValue + " is a prime number!");
		}
	}	
	
		
		
}	
		
		
	

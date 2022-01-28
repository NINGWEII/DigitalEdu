import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
		
		/* Code below works just fine outside while loop. but once inside
		 * while loop, it only gives correct answer in the first iteration. 
		 * After the fist iteration it stops giving correct answer.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please, submit a number to be evaluated if it's prime or not: ");
		
		boolean flag1 = false;
		boolean flag2 = true;
		
		while (flag2) {
			
			int inputValue = scan.nextInt();
		
			for (int i = 2; i <= inputValue / 2; i++) {
				if (inputValue % i == 0) {
					flag1 = true;
					break;
				}
			}
			if (flag1) {
				System.out.println("" + inputValue + " is NOT a prime number");
			}
			else {
				System.out.println("" + inputValue + " is a PRIME number!");
			}
			
		 }	
		
	
		
			
		
	}

}

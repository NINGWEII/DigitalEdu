
public class DigitalEdu_HomeWork4_Problem5 {
	public static void main(String[] args) {

//(Problem 5)
//		დაწერეთ ფუნქცია private static int sumEvens(int[] arr), რომელიც
//		დააბრუნებს მასივში ლუწ ინდექსზე მყოფი ელემენტების ჯამს.
				
		//indexes -->0  1  2  3  4  5  6  7
		int arr[] = {6, 4, 7, 9, 2, 3, 1, 8};
		int resultEvenSum = 0; 
		int x = arr.length;
		
		System.out.println(calculateSumOfNumbersOnEvenIndex(arr, resultEvenSum));
	}
	
	private static int calculateSumOfNumbersOnEvenIndex(int[] arr, int resultEvenSum) {
		for (int i = 2; i < arr.length; i += 2) {
			resultEvenSum += arr[i];
		}
		return resultEvenSum;
	}
	
}

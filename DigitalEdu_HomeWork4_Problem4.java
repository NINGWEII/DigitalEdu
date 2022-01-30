
public class DigitalEdu_HomeWork4_Problem4 {
	public static void main(String[] args) {

//(Problem 4)
//		დაწერეთ ფუნქცია private static int sum(int[] arr), რომელიც დააბრუნებს
//		მასივში ელემენტების ჯამს.
		
		int arr[] = {4, 2, 3, 1};
		int resultSum = 0;
		sum(arr, resultSum);
		System.out.println("The sum of all values in an array is equal to: " + sum(arr, resultSum));
		
	}
	
	private static int sum(int[] arr, int resultSum) {
		for (int i = 0; i < arr.length; i++) {
			resultSum = resultSum + arr[i];
		}
	                        	                 
		return resultSum;
	}
	
}

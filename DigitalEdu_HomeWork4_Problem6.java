
public class DigitalEdu_HomeWork4_Problem6 {
	public static void main(String[] args) {

//(Problem 6)
//		დაწერეეეეეეეეთ ფუნქცია private static int sumOdds(int[] arr), რომელიც
//		დააბრუნებს მასივში კენტ ინდექსებზე მყოფი ელემენტების ჯამს.
	   
		//indexes -->0  1  2  3  4  5  6  7  8  9
		int arr[] = {9, 3, 1, 4, 8, 5, 4, 2, 7, 2 };
		int resultOddSum = 0;
		
		System.out.println(calculateSumOfNumbersOnOddIndex(arr, resultOddSum));
	}
	
	private static int calculateSumOfNumbersOnOddIndex(int[] arr, int resultOddSum) {
		for (int i = 1; i < arr.length; i += 2) {
			resultOddSum = resultOddSum + arr[i];
		}
		return resultOddSum;
	}
	
}

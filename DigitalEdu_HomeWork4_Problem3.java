
public class DigitalEdu_HomeWork4_Problem3 {

	public static void main(String[] args) {

//(Problem 3)
//		დაწერეთ ფუნქცია countEvents(int[] arr), რომელიც დაგიბრუნებთ რიცხვს -
//		რამდენი ლუწი რიცხვია მასივში. მაგალითად: countEvens([2, 2, 0]) →
//		3; countEvens([1, 3, 5]) → 0

		int arr[] = {2, 6, 17, 15, 1, 8, 14, 8, 3, 7, 13, 12,  4, 3, 18, 1};
		int howManyEven = arr.length;
		countEvens(arr, howManyEven);
		System.out.println(countEvens(arr, howManyEven));
		
		
	}
		
		private static int countEvens(int[] arr, int howManyEven) {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] % 2 == 1) 
					howManyEven = howManyEven - 1;
			}
			return howManyEven;
		}
	
	
}

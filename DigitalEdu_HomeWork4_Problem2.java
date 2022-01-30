
public class DigitalEdu_HomeWork4_Problem2 {
	public static void main(String[] args) {

//(Problem 2)
//		დაწერეთ ფუნქცია private static boolean sameFirstLast(int[] nums), რომელიც
//		აბრუნებს true-ს თუ მისი პირველი და ბოლო ელემენტი ტოლია, false-ს
//		წინააღმდეგ შემთხვევაში. მაგალითად: sameFirstLast([1, 2, 3]) -> false;
//		sameFirstLast([1, 2, 3, 1]) -> true
		
		int arr[] = {2, 4, 3, 1, 9, 6, 8, 7, 3, 2};
		boolean sameFirstLast = false;
		sameFirstLast(arr, sameFirstLast);
		
		if (sameFirstLast(arr, sameFirstLast))
			System.out.println("First and last elements of this array are equal!");
		else System.out.println("First and last elements of this array are not equal");
	}
	
	private static boolean sameFirstLast(int[] arr, boolean sameFirstLast) {
		if (arr[0] == arr[arr.length-1]) 
			sameFirstLast = true;
		
		return sameFirstLast;
	}
	
}
